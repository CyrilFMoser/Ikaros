package Program_15 

package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: (Char,Boolean), b: E) extends T_A[C, D]

val v_a: T_A[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
}
}
// This is not matched: (CC_A Boolean Boolean Boolean Wildcard Wildcard (T_A Boolean Boolean))
// This is not matched: (CC_A Boolean Boolean Boolean Wildcard Wildcard (T_A Boolean Boolean))