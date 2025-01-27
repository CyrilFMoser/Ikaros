package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_D[C, D](a: T_A, b: D) extends T_B[C, D]

val v_a: CC_D[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(), _) => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard Wildcard T_A)