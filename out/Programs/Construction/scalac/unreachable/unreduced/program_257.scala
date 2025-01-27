package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: T_A[C, C]) extends T_A[C, T_A[T_A[Int, Int], T_A[Int, Byte]]]
case class CC_B(a: T_A[T_A[Boolean, Byte], CC_A[Char]], b: CC_A[T_A[Char, Char]]) extends T_A[CC_A[T_A[Int, Boolean]], T_A[T_A[Int, Int], T_A[Int, Byte]]]
case class CC_C[D, E](a: Int, b: CC_A[(Int,Int)], c: Char) extends T_A[D, T_A[T_A[Int, Int], T_A[Int, Byte]]]

val v_a: T_A[CC_A[T_A[Int, Boolean]], T_A[T_A[Int, Int], T_A[Int, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, _) => 2 
}
}