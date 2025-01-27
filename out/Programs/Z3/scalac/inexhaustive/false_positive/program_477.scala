package Program_30 

package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Char]) extends T_A[T_B[Char]]
case class CC_B[C](a: C) extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
}
}
// This is not matched: (CC_B Boolean Wildcard (T_B (CC_A Boolean Boolean)))
// This is not matched: (CC_A Wildcard Wildcard Wildcard (T_A (T_A Byte)))