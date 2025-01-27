package Program_31 

package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[Byte, Boolean]]
case class CC_B[D](a: T_A[D, D]) extends T_A[D, T_A[Byte, Boolean]]
case class CC_C[E, F](a: F, b: CC_B[E]) extends T_A[CC_A[Char], E]

val v_a: T_A[CC_A[Char], Char] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
}
}
// This is not matched: (CC_C Char
//      Boolean
//      Wildcard
//      (CC_B Char Wildcard (T_A Char (T_A Byte Boolean)))
//      (T_A (CC_A Char Boolean) Char))
// This is not matched: (CC_C Int Wildcard Wildcard Wildcard (T_A (CC_A Int Boolean) Int))