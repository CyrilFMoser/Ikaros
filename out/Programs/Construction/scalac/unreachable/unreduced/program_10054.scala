package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: Char, c: T_A[T_A[Char, T_A[Int, (Boolean,Boolean)]], T_A[T_A[Char, T_A[Int, (Boolean,Boolean)]], T_A[Char, T_A[Int, (Boolean,Boolean)]]]]) extends T_A[C, T_A[C, C]]
case class CC_B[E](a: Char, b: T_A[E, E], c: T_A[E, T_A[E, E]]) extends T_A[E, T_A[E, E]]
case class CC_C[F](a: Int, b: T_A[F, T_A[F, F]], c: CC_A[F]) extends T_A[F, T_A[F, F]]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(CC_A(_, _, _), _, _)) => 0 
  case CC_A(_, _, CC_A(CC_B(_, _, _), _, _)) => 1 
  case CC_A(_, _, CC_A(CC_C(_, _, _), _, _)) => 2 
  case CC_A(_, _, CC_B(_, _, _)) => 3 
  case CC_A(_, _, CC_C(_, CC_A(_, _, _), CC_A(_, _, _))) => 4 
  case CC_A(_, _, CC_C(_, CC_B(_, _, _), CC_A(_, _, _))) => 5 
  case CC_A(_, _, CC_C(_, CC_C(_, _, _), CC_A(_, _, _))) => 6 
  case CC_B(_, _, CC_A(_, _, _)) => 7 
  case CC_B(_, _, CC_B(_, _, CC_A(_, _, _))) => 8 
  case CC_B(_, _, CC_B(_, _, CC_B(_, _, _))) => 9 
  case CC_B(_, _, CC_B(_, _, CC_C(_, _, _))) => 10 
  case CC_B(_, _, CC_C(_, _, _)) => 11 
  case CC_C(_, _, _) => 12 
}
}