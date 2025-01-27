package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[T_A[T_A[Int, Char], T_A[Char, Boolean]], C]
case class CC_B[E](a: CC_A[E, CC_A[E, Int]], b: T_A[E, E]) extends T_A[T_A[T_A[Int, Char], T_A[Char, Boolean]], E]

val v_a: T_A[T_A[T_A[Int, Char], T_A[Char, Boolean]], Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}