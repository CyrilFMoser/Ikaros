package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Int]) extends T_A[T_A[T_A[Char, Int], T_A[Char, Int]], C]
case class CC_B[D](a: T_A[D, T_A[D, D]], b: CC_A[T_A[D, D]], c: D) extends T_A[T_A[T_A[Char, Int], T_A[Char, Int]], D]
case class CC_C[E](a: CC_A[E], b: E) extends T_A[T_A[T_A[Char, Int], T_A[Char, Int]], E]

val v_a: T_A[T_A[T_A[Char, Int], T_A[Char, Int]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_), _) => 1 
  case CC_C(_, _) => 2 
}
}