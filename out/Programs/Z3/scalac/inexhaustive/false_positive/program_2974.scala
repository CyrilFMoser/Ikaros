package Program_15 

package Program_3 

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
  case CC_C((CC_E(_),CC_F(_, _, _)), CC_F(_, _, _), CC_B()) => 0 
}
}
// This is not matched: (CC_C Wildcard
//      (CC_D (CC_A T_B T_B (T_A T_B))
//            (CC_A (CC_C Wildcard Wildcard Wildcard Wildcard)
//                  T_B
//                  (T_A (CC_C Wildcard Wildcard Wildcard Wildcard)))
//            T_B)
//      Wildcard
//      (T_A (CC_A (Tuple Char Byte) T_B T_B)))
// This is not matched: (CC_B Byte (T_A Byte))