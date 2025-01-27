package Program_15 

package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: B, c: T_A[B]) extends T_A[T_A[Byte]]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x', _) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_A (T_A Int))