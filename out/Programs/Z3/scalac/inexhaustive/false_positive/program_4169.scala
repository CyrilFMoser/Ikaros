package Program_14 

package Program_9 

object Test {
sealed trait T_A
case class CC_A[A](a: (T_A,T_A), b: A) extends T_A

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _),CC_A(_, _)), 12) => 0 
  case CC_A(_, 12) => 1 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_A Wildcard Wildcard (CC_A Wildcard Wildcard Wildcard T_A) T_A)