package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Boolean, b: T_A[D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C(a: T_A[(Char,Char)]) extends T_A[T_A[Boolean]]
case class CC_D[F](a: T_B[F, F], b: T_A[T_A[Boolean]]) extends T_B[T_A[T_A[Boolean]], F]
case class CC_E[G]() extends T_B[T_A[T_A[Boolean]], G]
case class CC_F[H]() extends T_B[T_A[T_A[Boolean]], H]

val v_a: T_B[T_A[T_A[Boolean]], Boolean] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(true, CC_A(_, _))) => 0 
  case CC_D(_, CC_A(true, CC_B())) => 1 
  case CC_D(_, CC_A(true, CC_C(_))) => 2 
  case CC_D(_, CC_A(false, CC_A(_, _))) => 3 
  case CC_D(_, CC_A(false, CC_B())) => 4 
  case CC_D(_, CC_A(false, CC_C(_))) => 5 
  case CC_D(_, CC_B()) => 6 
  case CC_D(_, CC_C(_)) => 7 
  case CC_E() => 8 
  case CC_F() => 9 
}
}