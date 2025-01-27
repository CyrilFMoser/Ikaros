package Program_15 

object Test {
sealed trait T_B[B]
case class CC_D[F](a: Byte) extends T_B[F]

val v_a: CC_D[Boolean] = null
val v_b: Int = v_a match{
  case CC_D(0) => 0 
}
}
// This is not matched: (CC_A Wildcard
//      (CC_B Byte Wildcard Wildcard Wildcard (T_A Byte))
//      (T_A (T_A Boolean)))