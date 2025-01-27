package Program_31 

package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, Byte], b: D, c: T_A[D, D]) extends T_A[C, Byte]
case class CC_B[F, E](a: Char, b: F, c: Int) extends T_A[F, E]
case class CC_C(a: CC_A[Char, Byte], b: (Int,Char), c: (Char,Boolean)) extends T_A[T_A[Char, Boolean], Byte]

val v_a: T_A[CC_C, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_C(_, _, _), 12) => 0 
  case CC_B(_, _, _) => 1 
  case CC_B(_, _, 12) => 2 
  case CC_B('x', _, 12) => 3 
  case CC_A(_, _, _) => 4 
  case CC_A(CC_B(_, _, _), _, CC_B(_, _, _)) => 5 
  case CC_A(_, _, CC_B(_, _, _)) => 6 
  case CC_A(_, _, CC_A(_, _, _)) => 7 
}
}
// This is not matched: (CC_A (CC_C Boolean Boolean Boolean (T_A Boolean Boolean))
//      Boolean
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A (CC_C Boolean Boolean Boolean (T_A Boolean Boolean)) Byte))
// This is not matched: (CC_A (CC_C (CC_A (CC_C Wildcard Int T_A) Wildcard T_A) Int T_A) Wildcard T_A)