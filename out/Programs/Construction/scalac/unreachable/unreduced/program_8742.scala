package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_B[T_A[Char, Boolean]]) extends T_A[T_B[(Byte,Boolean)], T_B[Byte]]
case class CC_B(a: T_B[T_B[CC_A]], b: CC_A) extends T_A[T_B[(Byte,Boolean)], T_B[Byte]]
case class CC_C[D](a: T_A[D, D]) extends T_B[D]
case class CC_D[E](a: Boolean, b: CC_C[E], c: Int) extends T_B[E]
case class CC_E[F](a: CC_C[F], b: Char, c: T_B[F]) extends T_B[F]

val v_a: T_A[T_B[(Byte,Boolean)], T_B[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_)) => 0 
  case CC_A(CC_D(_, CC_C(_), _)) => 1 
  case CC_A(CC_E(CC_C(_), _, _)) => 2 
  case CC_B(CC_C(_), CC_A(CC_C(_))) => 3 
  case CC_B(CC_D(_, _, _), CC_A(CC_C(_))) => 4 
  case CC_B(CC_E(_, _, _), CC_A(CC_C(_))) => 5 
  case CC_B(CC_C(_), CC_A(CC_D(_, _, _))) => 6 
  case CC_B(CC_D(_, _, _), CC_A(CC_D(_, _, _))) => 7 
  case CC_B(CC_E(_, _, _), CC_A(CC_D(_, _, _))) => 8 
  case CC_B(CC_C(_), CC_A(CC_E(_, _, _))) => 9 
  case CC_B(CC_E(_, _, _), CC_A(CC_E(_, _, _))) => 10 
}
}
// This is not matched: CC_B(CC_D(_, _, _), CC_A(CC_E(_, _, _)))