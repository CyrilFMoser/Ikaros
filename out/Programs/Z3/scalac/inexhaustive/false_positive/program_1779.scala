package Program_31 

package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[B]) extends T_A[B]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Char Boolean Wildcard (T_A Char))
// This is not matched: Pattern match is empty without constants