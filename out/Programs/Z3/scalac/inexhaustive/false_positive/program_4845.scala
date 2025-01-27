package Program_13 

package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, D], b: Char) extends T_A[C, T_A[Int, (Byte,Char)]]
case class CC_B(a: CC_A[Char, Boolean], b: Int) extends T_A[(Int,Char), T_A[Int, (Byte,Char)]]

val v_a: T_A[(Int,Char), T_A[Int, (Byte,Char)]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_A(_, 'x') => 1 
}
}
// This is not matched: (CC_A (Tuple Int Char)
//      Boolean
//      Wildcard
//      Wildcard
//      (T_A (Tuple Int Char) (T_A Int (Tuple Byte Char))))
// This is not matched: (CC_A Wildcard Wildcard T_A)