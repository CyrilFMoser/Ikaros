package Program_31 

package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: B) extends T_A[B]
case class CC_B(a: T_A[Char]) extends T_A[CC_A[Char, Int]]
case class CC_C() extends T_A[CC_A[Char, Int]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Byte Boolean Wildcard (T_A Byte))
// This is not matched: (CC_A Int
//      Byte
//      Wildcard
//      Wildcard
//      (CC_B Wildcard Boolean Wildcard T_B)
//      (T_A Int Byte))