package Program_11 

package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: D, b: Boolean, c: T_A[Char, D]) extends T_A[T_A[C, C], C]

val v_a: T_A[T_A[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}
// This is not matched: (CC_A Boolean
//      Boolean
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A (T_A Boolean Boolean) Boolean))
// This is not matched: (CC_A (T_A (T_A Char)))