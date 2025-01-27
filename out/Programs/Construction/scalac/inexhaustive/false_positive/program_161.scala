package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_B, b: Byte, c: T_B) extends T_A[B]
case class CC_D() extends T_B
case class CC_E(a: T_A[T_B]) extends T_B

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(CC_A(_, _, CC_E(_))) => 0 
}
}
// This is not matched: CC_A(CC_C(_, _, _), CC_B(_, _))