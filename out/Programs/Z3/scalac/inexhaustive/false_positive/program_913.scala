package Program_31 

package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: C, b: T_A[Int, E]) extends T_A[C, D]

val v_a: T_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A Char Boolean Boolean Wildcard Wildcard (T_A Char Boolean))
// This is not matched: Pattern match is empty without constants