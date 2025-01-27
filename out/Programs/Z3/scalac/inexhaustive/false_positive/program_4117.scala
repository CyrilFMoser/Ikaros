package Program_15 

package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: C) extends T_A[T_A[C, C], C]
case class CC_B[E](a: T_A[E, E], b: CC_A[E, E], c: Byte) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_), 0) => 1 
  case CC_B(_, _, _) => 2 
}
}
// This is not matched: (CC_A Char Boolean Wildcard (T_A (T_A Char Char) Char))
// This is not matched: (CC_D (CC_A T_A) Char Wildcard Wildcard Wildcard (T_B Char (CC_A T_A)))