package Program_28 

package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: T_A[E, Char], c: T_B[E, E]) extends T_A[T_A[Int, Char], T_B[(Int,Char), (Byte,Boolean)]]

val v_a: T_A[T_A[Int, Char], T_B[(Int,Char), (Byte,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}
// This is not matched: (CC_A Boolean
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A (T_A Int Char) (T_B (Tuple Int Char) (Tuple Byte Boolean))))
// This is not matched: (CC_A Wildcard T_A)