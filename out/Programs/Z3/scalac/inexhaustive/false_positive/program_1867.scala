package Program_30 

package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: Byte, b: T_A[D, C]) extends T_A[D, C]
case class CC_B[E, F](a: (Byte,Int)) extends T_A[E, CC_A[Byte, (Int,Boolean)]]
case class CC_C() extends T_A[CC_A[Boolean, Boolean], CC_A[Byte, (Int,Boolean)]]

val v_a: T_A[Boolean, CC_A[Byte, (Int,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_B((0,12)) => 0 
  case CC_B(_) => 1 
  case CC_A(0, CC_A(_, _)) => 2 
  case CC_A(_, _) => 3 
}
}
// This is not matched: (CC_B Boolean
//      Boolean
//      Wildcard
//      (T_A Boolean (CC_A Byte (Tuple Int Boolean) Boolean Boolean Boolean)))
// This is not matched: (CC_B Wildcard (T_A (CC_A Boolean Char Boolean Boolean Boolean)))