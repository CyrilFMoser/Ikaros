package Program_15 

object Test {
sealed trait T_B[C]
case class CC_B[F]() extends T_B[F]
case class CC_C[G](a: T_B[G]) extends T_B[G]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_B()) => 0 
}
}
// This is not matched: (CC_A Boolean
//      (T_A Boolean Boolean)
//      Wildcard
//      (T_A Boolean (T_A Boolean Boolean)))