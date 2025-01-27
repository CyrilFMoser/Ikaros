package Program_30 

package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[B]) extends T_A[T_A[(Char,Int)]]

val v_a: T_A[T_A[(Char,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A (T_A (Tuple Char Int))
//      Wildcard
//      (CC_A Boolean Wildcard Wildcard (T_A (T_A (Tuple Char Int))))
//      (T_A (T_A (Tuple Char Int))))
// This is not matched: (CC_C (T_A Boolean) Wildcard Wildcard Wildcard (T_A (T_A Boolean)))