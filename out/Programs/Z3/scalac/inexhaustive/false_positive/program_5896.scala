package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[C, D]
case class CC_B[F](a: T_A[Byte, Byte]) extends T_A[Byte, F]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_)) => 0 
}
}
// This is not matched: (CC_B Wildcard T_A)