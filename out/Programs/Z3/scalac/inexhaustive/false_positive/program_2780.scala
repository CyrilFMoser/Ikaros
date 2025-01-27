package Program_31 

package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: T_A[E, E], b: T_A[D, E], c: Int) extends T_A[C, D]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), _) => 0 
}
}
// This is not matched: (CC_A Char Int Byte Wildcard Wildcard Wildcard (T_A Int Char))
// This is not matched: Pattern match is empty without constants