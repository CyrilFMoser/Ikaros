package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[Byte], b: Byte) extends T_A[T_A[Boolean]]
case class CC_B() extends T_A[T_A[Boolean]]
case class CC_C(a: T_A[T_A[Boolean]]) extends T_A[T_A[Boolean]]
case class CC_D[E, D]() extends T_B[E, D]
case class CC_E[F, G](a: Char, b: T_B[F, F]) extends T_B[G, F]
case class CC_F[H, I](a: T_A[T_A[Boolean]], b: H) extends T_B[H, I]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_, 0)) => 2 
  case CC_C(CC_A(_, _)) => 3 
  case CC_C(CC_B()) => 4 
  case CC_C(CC_C(CC_A(_, _))) => 5 
  case CC_C(CC_C(CC_B())) => 6 
  case CC_C(CC_C(CC_C(_))) => 7 
}
}