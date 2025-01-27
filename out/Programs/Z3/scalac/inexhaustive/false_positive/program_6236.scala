package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_B[F, G](a: G) extends T_A[F, G]

val v_a: CC_B[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_D Wildcard (CC_D Wildcard (CC_F Boolean T_B) T_B) T_B)