package Program_15 

package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C](a: T_B) extends T_A[B]
case class CC_B(a: T_A[T_B]) extends T_A[(Byte,T_B)]
case class CC_C(a: T_A[Byte], b: Int, c: Byte) extends T_B

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Char T_B (CC_C Wildcard Int Wildcard T_B) (T_A Char))
// This is not matched: (CC_C (T_A Byte Boolean)
//      (T_B Boolean Byte)
//      Wildcard
//      Wildcard
//      (T_B (T_B Boolean Byte) (T_A Byte Boolean)))