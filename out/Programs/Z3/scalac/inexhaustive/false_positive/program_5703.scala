package Program_15 

package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Int, b: T_A[Char, Char]) extends T_A[T_A[Boolean, Int], Int]
case class CC_B[C](a: (CC_A,(Boolean,Byte))) extends T_A[T_A[Boolean, Int], Int]

val v_a: T_A[T_A[Boolean, Int], Int] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_A(_, _) => 1 
}
}
// This is not matched: (CC_B Boolean Wildcard (T_A (T_A Boolean Int) Int))
// This is not matched: (CC_C Wildcard Wildcard T_A)