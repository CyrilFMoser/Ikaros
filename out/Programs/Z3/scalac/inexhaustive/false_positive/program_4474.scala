package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_E[E, D](a: T_A) extends T_B[E, D]

val v_a: CC_E[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_E(CC_B()) => 0 
}
}
// This is not matched: (CC_B Byte (T_A Byte))