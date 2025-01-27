package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A() extends T_A[Byte, T_A[T_A[Boolean, Int], T_B[Boolean]]]
case class CC_B[D, E](a: T_A[D, E], b: CC_A, c: T_B[E]) extends T_B[D]
case class CC_C[F](a: T_B[F]) extends T_B[F]

val v_a: CC_C[T_A[Byte, T_A[T_A[Boolean, Int], T_B[Boolean]]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _, _)) => 0 
  case CC_C(CC_C(CC_B(_, _, _))) => 1 
  case CC_C(CC_C(CC_C(_))) => 2 
}
}