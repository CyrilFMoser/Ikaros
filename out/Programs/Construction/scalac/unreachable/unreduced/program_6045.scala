package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[Boolean, Byte], C]) extends T_A[C, T_A[T_A[(Int,Int), Char], T_A[Byte, Boolean]]]
case class CC_B(a: CC_A[T_A[Int, Int]], b: CC_A[Int]) extends T_A[(T_A[Byte, Byte],(Byte,Int)), T_A[T_A[(Int,Int), Char], T_A[Byte, Boolean]]]
case class CC_C[D](a: Boolean, b: Char, c: (T_A[(Boolean,Int), CC_B],CC_A[CC_B])) extends T_A[T_A[D, D], D]

val v_a: T_A[(T_A[Byte, Byte],(Byte,Int)), T_A[T_A[(Int,Int), Char], T_A[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}