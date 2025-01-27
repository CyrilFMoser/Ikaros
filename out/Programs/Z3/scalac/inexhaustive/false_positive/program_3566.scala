package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_C[F](a: F) extends T_A[T_A[F, F], F]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C(0) => 0 
}
}
// This is not matched: (CC_E T_B)