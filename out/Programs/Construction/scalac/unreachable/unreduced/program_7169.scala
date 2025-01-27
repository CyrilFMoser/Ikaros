package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_A[D, D]]
case class CC_B[E](a: T_A[E, E], b: T_A[E, T_A[E, E]]) extends T_A[E, T_A[E, E]]
case class CC_C[F]() extends T_B[T_A[CC_A[Char], T_A[CC_A[Char], CC_A[Char]]]]
case class CC_D(a: T_A[T_A[Boolean, Char], T_A[T_A[Boolean, Char], T_A[Boolean, Char]]]) extends T_B[T_A[CC_A[Char], T_A[CC_A[Char], CC_A[Char]]]]
case class CC_E[G]() extends T_B[G]

val v_a: T_B[T_A[CC_A[Char], T_A[CC_A[Char], CC_A[Char]]]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_A()) => 1 
  case CC_D(CC_B(_, _)) => 2 
  case CC_E() => 3 
}
}