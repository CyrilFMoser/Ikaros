package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[E](a: E, b: T_A[E, E]) extends T_A[T_A[E, (Char,Boolean)], E]

val v_a: T_A[T_A[Int, (Char,Boolean)], Int] = null
val v_b: Int = v_a match{
  case CC_A(12, _) => 0 
}
}
// This is not matched: (CC_A T_A)