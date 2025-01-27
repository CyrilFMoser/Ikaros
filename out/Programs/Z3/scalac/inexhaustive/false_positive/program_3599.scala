package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: T_A) extends T_B[C, CC_C]

val v_a: CC_D[Int] = null
val v_b: Int = v_a match{
  case CC_D(CC_A()) => 0 
}
}
// This is not matched: (CC_A (CC_C Wildcard Wildcard T_A) Wildcard T_A)