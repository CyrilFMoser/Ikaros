package Program_29 

package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[B]) extends T_A[T_A[(Char,Int)]]

val v_a: T_A[T_A[(Char,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), CC_A(_, _)) => 0 
  case CC_A(CC_A(_, _), _) => 1 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard (T_A (T_A (Tuple Char Int))))
// This is not matched: (CC_C (T_A Boolean) Wildcard Wildcard Wildcard (T_A (T_A Boolean)))