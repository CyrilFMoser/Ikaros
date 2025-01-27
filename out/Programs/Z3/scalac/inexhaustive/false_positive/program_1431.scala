package Program_31 

package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: T_A[(Char,Char)], b: T_B[D], c: D) extends T_A[C]
case class CC_B[E](a: Char, b: T_A[E]) extends T_B[E]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_A(_, CC_B(_, _), _) => 1 
}
}
// This is not matched: (CC_A Char Boolean Wildcard Wildcard Wildcard (T_A Char))
// This is not matched: (CC_B Boolean Char Boolean Wildcard (T_A Char Boolean))