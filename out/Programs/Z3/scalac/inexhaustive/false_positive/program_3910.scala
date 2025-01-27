package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[C]
case class CC_E[G](a: Int) extends T_B[G]

val v_a: CC_E[Byte] = null
val v_b: Int = v_a match{
  case CC_E(12) => 0 
}
}
// This is not matched: (CC_B Boolean
//      (CC_D Boolean Boolean)
//      Wildcard
//      Int
//      (T_A Boolean (CC_D Boolean Boolean)))