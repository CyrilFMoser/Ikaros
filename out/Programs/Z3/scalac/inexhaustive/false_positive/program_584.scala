package Program_31 

package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: T_A[D, D]) extends T_A[C, D]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Char Int Boolean Wildcard (T_A Int Char))
// This is not matched: (CC_A T_A)