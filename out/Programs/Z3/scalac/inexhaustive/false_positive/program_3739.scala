package Program_15 

package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, D], b: T_A[C, C], c: T_A[D, D]) extends T_A[C, D]
case class CC_B[E]() extends T_A[Byte, Boolean]

val v_a: T_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, _, CC_A(_, _, _)) => 1 
}
}
// This is not matched: (CC_B Boolean (T_A Byte Boolean))
// This is not matched: (CC_D Char Wildcard Wildcard (T_B Char))