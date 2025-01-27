package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_C() extends T_A
case class CC_D[D, C](a: T_A) extends T_B[D, C]

val v_a: CC_D[Char, CC_A] = null
val v_b: Int = v_a match{
  case CC_D(CC_C()) => 0 
}
}
// This is not matched: (CC_B Wildcard T_A)