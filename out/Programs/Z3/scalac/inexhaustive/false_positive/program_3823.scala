package Program_8 

package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Char, b: B, c: T_A[B]) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard Wildcard (T_A (T_A Byte)))
// This is not matched: Pattern match is empty without constants