package Program_14 

package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Byte) extends T_A[B]
case class CC_B[C, D]() extends T_A[C]
case class CC_C(a: Int, b: Char, c: T_A[Boolean]) extends T_A[CC_B[Int, Byte]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_B()) => 0 
}
}
// This is not matched: (CC_C Int
//      Wildcard
//      (CC_A Boolean Wildcard (T_A Boolean))
//      (T_A (CC_B Int Byte Boolean)))
// This is not matched: Pattern match is empty without constants