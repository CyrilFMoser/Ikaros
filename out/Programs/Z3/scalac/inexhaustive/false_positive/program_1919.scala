package Program_30 

package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[E, E], b: F) extends T_A[T_B[E, Boolean], E]

val v_a: T_A[T_B[Char, Boolean], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A Char Boolean Wildcard Wildcard (T_A (T_B Char Boolean) Char))
// This is not matched: (CC_D Char (CC_C Char (T_A Char)) (T_B (CC_A (Tuple Byte Int) Boolean) Char))