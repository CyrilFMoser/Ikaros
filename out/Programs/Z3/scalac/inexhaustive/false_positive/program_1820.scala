package Program_29 

package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, Boolean], b: T_A[C, C], c: T_A[D, C]) extends T_A[T_A[C, C], C]
case class CC_B[E]() extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, _, CC_A(_, _, _)) => 1 
}
}
// This is not matched: (CC_A Char
//      (T_A Char Char)
//      Wildcard
//      Wildcard
//      (CC_B Char (T_A (T_A Char Char) Char))
//      (T_A (T_A Char Char) Char))
// This is not matched: Pattern match is empty without constants