package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C]() extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: CC_B, b: (T_B[Boolean, CC_B],CC_A[T_A]), c: T_A) extends T_A
case class CC_D[D](a: T_A, b: D, c: CC_C) extends T_B[T_A, D]
case class CC_E[E](a: CC_A[E], b: CC_D[T_B[E, E]], c: E) extends T_B[T_A, E]
case class CC_F[F](a: T_B[F, F]) extends T_B[F, T_B[T_A, CC_E[F]]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A()) => 1 
  case CC_B(CC_C(_, (_,_), CC_A())) => 2 
  case CC_B(CC_C(_, (_,_), CC_B(_))) => 3 
  case CC_B(CC_C(_, (_,_), CC_C(_, _, _))) => 4 
  case CC_C(_, _, _) => 5 
}
}
// This is not matched: CC_B(CC_B(_))