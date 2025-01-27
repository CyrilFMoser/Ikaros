package Program_31 

package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A[B, C]() extends T_A[B]
case class CC_B[D](a: T_A[D]) extends T_A[D]

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
  case CC_B(CC_B(_)) => 1 
}
}
// This is not matched: (CC_B Boolean (CC_A Boolean Boolean (T_A Boolean)) (T_A Boolean))
// This is not matched: (CC_A (T_B (Tuple Char Byte) Char)
//      Wildcard
//      Wildcard
//      (T_A (T_B (Tuple Char Byte) Char)
//           (T_A (T_B (Tuple Char Byte) Char) (T_B (Tuple Char Byte) Char))))