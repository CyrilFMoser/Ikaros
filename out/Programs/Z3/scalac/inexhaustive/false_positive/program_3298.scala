package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_C[H, G](a: Byte, b: (T_B,T_B)) extends T_A[G, H]
case class CC_E() extends T_B
case class CC_F() extends T_B

val v_a: CC_C[Int, CC_E] = null
val v_b: Int = v_a match{
  case CC_C(_, (_,CC_F())) => 0 
}
}
// This is not matched: (CC_E (CC_B T_A T_A) Wildcard (T_B (CC_B T_A T_A)))