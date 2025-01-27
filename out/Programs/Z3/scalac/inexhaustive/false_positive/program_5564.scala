package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_F[F](a: Byte) extends T_B[F]

val v_a: CC_F[Byte] = null
val v_b: Int = v_a match{
  case CC_F(0) => 0 
}
}
// This is not matched: (CC_A Wildcard (T_A (T_A Int)))