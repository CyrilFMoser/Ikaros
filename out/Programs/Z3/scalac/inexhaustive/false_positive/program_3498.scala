package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_B(a: T_A[T_B]) extends T_A[T_B]
case class CC_C() extends T_A[T_B]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_C()) => 0 
}
}
// This is not matched: (CC_B Int Byte Wildcard Wildcard (T_A Int Byte))