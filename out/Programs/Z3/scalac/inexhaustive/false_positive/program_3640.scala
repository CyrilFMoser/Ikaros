package Program_15 

package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: (Char,Boolean)) extends T_A[C, D]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(('x',_)) => 0 
  case CC_A((_,_)) => 1 
}
}
// This is not matched: (CC_A Int Char Boolean Wildcard (T_A Int Char))
// This is not matched: (CC_E Int Wildcard Wildcard Wildcard (T_B (T_A Boolean) Int))