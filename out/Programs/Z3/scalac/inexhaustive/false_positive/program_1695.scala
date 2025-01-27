package Program_30 

package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, Int], b: T_A[C, D], c: T_A[C, C]) extends T_A[T_A[C, C], C]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
}
}
// This is not matched: (CC_A Char Boolean Wildcard Wildcard Wildcard (T_A (T_A Char Char) Char))
// This is not matched: Pattern match is empty without constants