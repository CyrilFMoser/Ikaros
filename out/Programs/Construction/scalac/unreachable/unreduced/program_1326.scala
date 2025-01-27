package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A() extends T_A[T_B, T_B]
case class CC_B[C](a: CC_A) extends T_A[(Char,CC_A), C]
case class CC_C(a: T_A[CC_B[T_B], Int], b: T_A[(Char,CC_A), T_A[T_B, T_B]], c: T_A[T_B, T_B]) extends T_B
case class CC_D(a: Boolean, b: T_A[T_A[T_B, T_B], (CC_A,CC_A)], c: CC_A) extends T_B
case class CC_E(a: Byte) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_E(0) => 1 
  case CC_E(_) => 2 
}
}
// This is not matched: CC_D(_, _, CC_A())