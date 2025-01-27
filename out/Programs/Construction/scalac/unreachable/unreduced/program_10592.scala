package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Boolean) extends T_A[T_A[T_A[Char, Char], T_A[Char, Char]], C]
case class CC_B[D](a: T_A[D, D], b: Char) extends T_A[T_A[T_A[Char, Char], T_A[Char, Char]], D]
case class CC_C[E, F](a: Byte, b: T_A[E, E]) extends T_A[T_A[T_A[Char, Char], T_A[Char, Char]], E]

val v_a: T_A[T_A[T_A[Char, Char], T_A[Char, Char]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(0, _) => 2 
  case CC_C(_, _) => 3 
}
}