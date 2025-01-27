package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: T_B[D]) extends T_A[(T_B[Boolean],T_B[Int]), D]
case class CC_B[E](a: T_A[E, E]) extends T_B[E]
case class CC_C[F](a: T_B[F]) extends T_B[F]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(CC_B(_)) => 1 
  case CC_C(CC_C(CC_B(_))) => 2 
  case CC_C(CC_C(CC_C(_))) => 3 
}
}