package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte, b: T_A[T_A[Boolean, C], Int]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: D, b: CC_A[D], c: D) extends T_A[D, T_A[D, D]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}