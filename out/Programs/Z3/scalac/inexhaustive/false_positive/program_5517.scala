package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_C[G, H](a: G, b: T_B) extends T_A[G, H]
case class CC_D() extends T_B
case class CC_E() extends T_B

val v_a: CC_C[CC_D, CC_E] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_D()) => 0 
}
}
// This is not matched: Pattern match is empty without constants