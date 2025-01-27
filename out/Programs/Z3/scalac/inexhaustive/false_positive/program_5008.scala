package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_B[F](a: F) extends T_A[F, T_B[F, F]]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_B Byte (CC_A Wildcard Wildcard T_A) Wildcard T_A)