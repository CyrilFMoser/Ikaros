package Program_13 

package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C]() extends T_A[B]
case class CC_B[D]() extends T_A[D]
case class CC_C(a: (T_B,T_B), b: T_B, c: CC_B[T_B]) extends T_A[CC_A[(Char,Byte), T_B]]
case class CC_D(a: T_A[T_B], b: T_A[CC_C]) extends T_B
case class CC_E(a: CC_C) extends T_B
case class CC_F(a: T_A[T_B], b: T_A[CC_C], c: CC_C) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C((CC_F(_, _, _),CC_F(_, _, _)), _, CC_B()) => 0 
}
}
// This is not matched: (CC_C (Tuple (CC_E Wildcard T_B) (CC_E Wildcard T_B))
//      Wildcard
//      Wildcard
//      (T_A (CC_A (Tuple Char Byte) T_B T_B)))
// This is not matched: (CC_B Byte (T_A Byte))