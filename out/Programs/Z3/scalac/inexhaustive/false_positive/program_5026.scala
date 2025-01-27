package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C]() extends T_A[C, D]
case class CC_C[F](a: T_A[Boolean, F], b: CC_A[F, F]) extends T_A[Boolean, F]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_, _), _) => 0 
}
}
// This is not matched: (CC_A T_A)