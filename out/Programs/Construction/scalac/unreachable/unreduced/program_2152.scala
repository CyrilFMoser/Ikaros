package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: D) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: CC_A[E], b: T_A[E, T_A[E, E]]) extends T_A[E, T_A[E, E]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_A(_), CC_A(_)) => 2 
  case CC_C(CC_A(_), CC_B(_)) => 3 
  case CC_C(CC_A(_), CC_C(_, _)) => 4 
}
}