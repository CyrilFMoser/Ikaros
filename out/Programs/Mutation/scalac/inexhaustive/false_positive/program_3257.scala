package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_C[D](a: T_B[D]) extends T_B[D]
case class CC_D[F]() extends T_B[F]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(CC_C(_))) => 0 
}
}
// This is not matched: Pattern match is empty without constants