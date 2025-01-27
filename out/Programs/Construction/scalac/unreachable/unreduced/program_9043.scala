package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, D]) extends T_A[T_A[T_A[Boolean, Char], T_A[Char, Boolean]], C]
case class CC_B[E](a: CC_A[E, E], b: E) extends T_A[T_A[T_A[Boolean, Char], T_A[Char, Boolean]], E]

val v_a: T_A[T_A[T_A[Boolean, Char], T_A[Char, Boolean]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _) => 1 
}
}