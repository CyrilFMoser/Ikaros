package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_B, T_B]
case class CC_B() extends T_B
case class CC_C() extends T_B

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_C()) => 0 
}
}
// This is not matched: (CC_B Wildcard (CC_A (CC_A Wildcard T_A) T_A) T_A)