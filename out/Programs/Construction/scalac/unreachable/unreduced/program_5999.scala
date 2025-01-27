package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Int) extends T_A[C, T_A[T_A[Byte, Int], Char]]
case class CC_B[D, E](a: CC_A[D], b: Byte) extends T_A[D, T_A[T_A[Byte, Int], Char]]

val v_a: T_A[Boolean, T_A[T_A[Byte, Int], Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
}
}