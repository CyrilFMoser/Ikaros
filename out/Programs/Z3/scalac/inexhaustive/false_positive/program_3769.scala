package Program_12 

object Test {
sealed trait T_B[C, D]
case class CC_B[G, F]() extends T_B[F, G]
case class CC_C[I, H](a: T_B[I, I]) extends T_B[I, H]

val v_a: CC_C[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_)) => 0 
}
}
// This is not matched: (CC_B Boolean Wildcard (T_A Int (T_A Int Int)))