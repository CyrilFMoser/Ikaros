package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_C[F](a: F) extends T_B[T_A[F], F]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C(0) => 0 
}
}
// This is not matched: (CC_A (T_A Byte) Wildcard Wildcard (T_A (T_A Byte)))