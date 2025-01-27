package Program_28 

package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: T_A[E, E], b: T_A[D, E], c: Int) extends T_A[C, D]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
}
}
// This is not matched: (CC_A Char Int Boolean Wildcard Wildcard Wildcard (T_A Int Char))
// This is not matched: Pattern match is empty without constants