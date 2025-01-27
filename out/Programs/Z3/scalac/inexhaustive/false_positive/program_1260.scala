package Program_31 

package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, D], b: T_A[C, D]) extends T_A[T_A[Boolean, Char], C]

val v_a: T_A[T_A[Boolean, Char], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A Byte Boolean Wildcard Wildcard (T_A (T_A Boolean Char) Byte))
// This is not matched: (CC_C (T_A Int))