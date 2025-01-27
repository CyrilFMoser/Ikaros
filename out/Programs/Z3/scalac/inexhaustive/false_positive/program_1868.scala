package Program_29 

package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: B, b: Byte) extends T_A[B]
case class CC_B(a: CC_A[Int, Int]) extends T_A[CC_A[Boolean, Char]]

val v_a: T_A[CC_A[Boolean, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: (CC_A (CC_A Boolean Char (T_A Boolean) Boolean Boolean)
//      Boolean
//      Wildcard
//      Wildcard
//      (T_A (CC_A Boolean Char (T_A Boolean) Boolean Boolean)))
// This is not matched: (CC_B Wildcard (T_A (CC_A Boolean Char Boolean Boolean Boolean)))