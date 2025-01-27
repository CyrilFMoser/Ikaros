package Program_30 

package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: T_A[E, E], b: E) extends T_A[D, C]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A Boolean Int Boolean Wildcard Wildcard (T_A Boolean Int))
// This is not matched: Pattern match is empty without constants