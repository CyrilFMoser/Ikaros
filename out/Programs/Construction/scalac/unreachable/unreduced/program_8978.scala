package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_A[T_A[Char]]]
case class CC_B() extends T_A[T_A[T_A[Char]]]
case class CC_C[D](a: T_A[D]) extends T_B[Char, D]
case class CC_D[F, E](a: T_B[F, F], b: Char, c: T_B[E, F]) extends T_B[E, F]

val v_a: T_B[Char, CC_B] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_, _, CC_C(_)) => 1 
  case CC_D(_, _, CC_D(_, 'x', CC_C(_))) => 2 
  case CC_D(_, _, CC_D(_, _, CC_C(_))) => 3 
  case CC_D(_, _, CC_D(_, 'x', CC_D(_, _, _))) => 4 
}
}
// This is not matched: CC_D(_, _, CC_D(_, _, CC_D(_, _, _)))