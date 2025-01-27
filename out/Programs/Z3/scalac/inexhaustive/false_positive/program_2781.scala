package Program_30 

package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: T_A[E, E], b: T_A[D, E], c: Int) extends T_A[C, D]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), 12) => 0 
  case CC_A(CC_A(_, _, _), _, 12) => 1 
  case CC_A(CC_A(_, _, _), _, _) => 2 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), 12) => 3 
}
}
// This is not matched: (CC_A Char Int Boolean Wildcard Wildcard Wildcard (T_A Int Char))
// This is not matched: Pattern match is empty without constants