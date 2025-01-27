package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[T_B[D], D], b: T_A[T_B[T_B[T_A[Boolean, Int]]], T_B[T_A[Boolean, Int]]]) extends T_A[T_B[D], D]
case class CC_B[F](a: T_A[F, F]) extends T_A[T_B[F], F]
case class CC_C[G](a: Boolean, b: T_A[T_B[G], G]) extends T_A[T_B[G], G]
case class CC_D[H]() extends T_B[H]
case class CC_E[I]() extends T_B[I]
case class CC_F[J](a: J, b: J, c: Boolean) extends T_B[J]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_C(_, CC_A(_, CC_B(_))) => 1 
  case CC_C(_, CC_A(_, CC_C(_, _))) => 2 
  case CC_C(_, CC_B(_)) => 3 
  case CC_C(_, CC_C(true, CC_A(_, _))) => 4 
  case CC_C(_, CC_C(false, CC_A(_, _))) => 5 
  case CC_C(_, CC_C(true, CC_B(_))) => 6 
  case CC_C(_, CC_C(false, CC_B(_))) => 7 
  case CC_C(_, CC_C(true, CC_C(_, _))) => 8 
  case CC_C(_, CC_C(false, CC_C(_, _))) => 9 
}
}