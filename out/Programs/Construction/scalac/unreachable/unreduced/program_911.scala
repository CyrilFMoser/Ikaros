package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[T_A[Int, Byte], (Char,Boolean)], C]
case class CC_B[D](a: D) extends T_A[T_A[T_A[Int, Byte], (Char,Boolean)], D]
case class CC_C(a: CC_B[CC_A[Byte]]) extends T_A[T_A[T_A[Int, Byte], (Char,Boolean)], CC_B[CC_B[Int]]]

val v_a: T_A[T_A[T_A[Int, Byte], (Char,Boolean)], CC_B[CC_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_B(_)) => 2 
}
}