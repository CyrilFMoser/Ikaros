package Program_9 

package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Char, b: B, c: T_A[B]) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A('x', _, _) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: Pattern match is empty without constants