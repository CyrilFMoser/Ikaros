package Program_31 

package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D]() extends T_A[T_B, C]
case class CC_B(a: Boolean) extends T_A[T_B, T_A[(Byte,Byte), T_B]]
case class CC_C(a: CC_A[Boolean, CC_B], b: T_A[T_B, CC_B], c: Int) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(), 12) => 0 
  case CC_C(CC_A(), CC_A(), _) => 1 
}
}
// This is not matched: (CC_C Wildcard
//      (CC_A (CC_B Wildcard Wildcard) T_B (T_A T_B (CC_B Wildcard Wildcard)))
//      Int
//      T_B)
// This is not matched: (CC_C Int Wildcard Wildcard (T_A (T_A (Tuple Boolean Int))))