package Program_30 

package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B[B, C](a: T_B[B], b: Byte) extends T_B[B]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _), _) => 0 
}
}
// This is not matched: (CC_B (CC_A T_A) T_A Wildcard Wildcard (T_B (CC_A T_A)))
// This is not matched: (CC_B (CC_E Char Int (T_B Char))
//      (T_A (CC_A Boolean Boolean Boolean (T_A Boolean Boolean))
//           (T_A (Tuple Char Int) Byte)))