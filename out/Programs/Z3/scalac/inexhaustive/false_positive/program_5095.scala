package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C[B](a: B, b: CC_B) extends T_B[B]
case class CC_E[C]() extends T_B[C]

val v_a: CC_C[T_B[T_B[CC_A]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_E(), _) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard T_B)