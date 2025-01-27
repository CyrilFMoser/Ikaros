package Program_31 

package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: Boolean, b: T_A[Byte, D], c: T_A[D, D]) extends T_A[C, D]
case class CC_B[E](a: E) extends T_A[CC_A[Char, Char], E]
case class CC_C[F, G](a: F) extends T_A[CC_A[Char, Char], F]

val v_a: T_A[CC_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
  case CC_B(_) => 1 
  case CC_C('x') => 2 
  case CC_C(_) => 3 
  case CC_A(_, CC_A(_, _, _), _) => 4 
}
}
// This is not matched: (CC_C Char
//      Boolean
//      Wildcard
//      (T_A (CC_A Char Char Boolean Boolean Boolean Boolean) Char))
// This is not matched: (CC_A T_A)