package Program_31 

package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, Boolean]) extends T_A[C, T_A[Boolean, Int]]
case class CC_B[E](a: (Byte,Char)) extends T_A[E, T_A[Byte, (Char,Int)]]

val v_a: T_A[Int, T_A[Boolean, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Int Boolean Wildcard (T_A Int (T_A Boolean Int)))
// This is not matched: (CC_A Char Boolean (T_A Char))