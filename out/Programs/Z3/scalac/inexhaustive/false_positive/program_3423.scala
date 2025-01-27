package Program_10 

package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Boolean, b: T_A[B], c: B) extends T_A[T_A[Boolean]]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, 'x') => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_A Char Wildcard Wildcard (T_A Char Int))