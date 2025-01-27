package Program_15 

package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: Int, b: T_A, c: B) extends T_A
case class CC_B(a: Byte, b: T_A, c: T_B[T_A]) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_A(_, _, _) => 1 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: Pattern match is empty without constants