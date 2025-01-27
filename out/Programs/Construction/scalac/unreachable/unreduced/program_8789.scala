package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A() extends T_A[T_B[T_A[Char, Int]], T_B[Byte]]
case class CC_B() extends T_A[T_B[T_A[Char, Int]], T_B[Byte]]
case class CC_C(a: Boolean, b: T_B[T_B[CC_B]], c: CC_B) extends T_A[T_B[T_A[Char, Int]], T_B[Byte]]
case class CC_D[D](a: T_B[D], b: T_B[D]) extends T_B[D]
case class CC_E[E](a: T_A[E, E]) extends T_B[E]
case class CC_F[F](a: T_B[F], b: F) extends T_B[F]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_D(CC_D(_, _), CC_D(_, _))) => 0 
  case CC_D(_, CC_D(CC_E(_), CC_D(_, _))) => 1 
  case CC_D(_, CC_D(CC_F(_, _), CC_D(_, _))) => 2 
  case CC_D(_, CC_D(CC_D(_, _), CC_E(_))) => 3 
  case CC_D(_, CC_D(CC_E(_), CC_E(_))) => 4 
  case CC_D(_, CC_D(CC_F(_, _), CC_E(_))) => 5 
  case CC_D(_, CC_D(CC_D(_, _), CC_F(_, _))) => 6 
  case CC_D(_, CC_D(CC_E(_), CC_F(_, _))) => 7 
  case CC_D(_, CC_D(CC_F(_, _), CC_F(_, _))) => 8 
  case CC_D(_, CC_E(_)) => 9 
  case CC_E(_) => 10 
  case CC_F(_, _) => 11 
}
}
// This is not matched: CC_D(_, CC_F(_, _))