package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[T_A[Boolean, Boolean], T_A[T_A[Boolean, Boolean], T_A[Boolean, Boolean]]]) extends T_A[C, T_A[C, C]]
case class CC_B[E](a: T_A[(Char,Char), T_A[(Char,Char), (Char,Char)]]) extends T_A[E, T_A[E, E]]
case class CC_C[F](a: CC_B[F], b: T_A[F, T_A[F, F]], c: T_A[F, T_A[F, F]]) extends T_A[CC_B[F], F]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(12, CC_A(_, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(_, CC_A(_, _))) => 1 
  case CC_A(12, CC_A(_, CC_B(_))) => 2 
  case CC_A(_, CC_A(_, CC_B(_))) => 3 
  case CC_A(12, CC_B(_)) => 4 
  case CC_A(_, CC_B(_)) => 5 
  case CC_B(CC_A(_, _)) => 6 
  case CC_B(CC_B(CC_A(_, _))) => 7 
  case CC_B(CC_B(CC_B(_))) => 8 
}
}