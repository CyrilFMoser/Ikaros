package Program_31 

object Test {
sealed trait T_A[B]
sealed trait T_B
case class CC_A[D]() extends T_A[D]
case class CC_C() extends T_A

val v_a: T_A[CC_C] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A (CC_A Wildcard T_A) T_A)