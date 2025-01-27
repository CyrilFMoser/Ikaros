package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D]() extends T_A[D]
case class CC_C[E](a: E) extends T_B[E]
case class CC_D[F](a: T_A[F], b: T_B[F]) extends T_B[F]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: Pattern match is empty without constants