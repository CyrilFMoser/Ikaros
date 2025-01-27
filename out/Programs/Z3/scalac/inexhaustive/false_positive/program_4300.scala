package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_C() extends T_A
case class CC_D[E, D](a: T_A, b: T_B[D, E]) extends T_B[E, D]

val v_a: CC_D[Char, CC_C] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(), _) => 0 
}
}
// This is not matched: (CC_D Char
//      (CC_C T_A T_A T_A T_A)
//      (CC_A T_A)
//      Wildcard
//      Wildcard
//      (T_B Char (CC_C T_A T_A T_A T_A)))