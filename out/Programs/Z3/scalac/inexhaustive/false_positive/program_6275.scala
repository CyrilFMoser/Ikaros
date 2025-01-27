package Program_14 

package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: T_B[B]) extends T_A
case class CC_B(a: T_A) extends T_B[(T_A,T_A)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_)) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)
// This is not matched: (CC_A Char Wildcard (T_A (T_A Char Char) Char))