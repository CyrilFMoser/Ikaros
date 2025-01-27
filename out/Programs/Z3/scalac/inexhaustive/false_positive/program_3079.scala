package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_B[F, G](a: F) extends T_A[G, F]

val v_a: CC_B[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_B Wildcard T_B)