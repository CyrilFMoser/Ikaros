package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[D, T_B[T_B[Char]]]
case class CC_B[E](a: E) extends T_B[E]
case class CC_C[F](a: T_B[F], b: F, c: T_B[CC_B[F]]) extends T_B[F]
case class CC_D[G](a: T_B[G], b: T_A[G, G]) extends T_B[G]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _, _) => 1 
  case CC_D(CC_B(_), _) => 2 
  case CC_D(CC_C(_, _, _), _) => 3 
  case CC_D(CC_D(CC_B(_), _), _) => 4 
  case CC_D(CC_D(CC_D(_, _), _), _) => 5 
}
}
// This is not matched: CC_D(CC_D(CC_C(_, _, _), _), _)