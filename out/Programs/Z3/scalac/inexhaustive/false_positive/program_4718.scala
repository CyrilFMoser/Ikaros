package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_A
case class CC_D[C, D](a: (CC_C,CC_A), b: T_A) extends T_B[C, D]

val v_a: CC_D[Char, CC_B] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A()) => 0 
}
}
// This is not matched: (CC_B (CC_B (CC_C Wildcard Wildcard T_B) Wildcard Wildcard T_B)
//      Wildcard
//      Wildcard
//      T_B)