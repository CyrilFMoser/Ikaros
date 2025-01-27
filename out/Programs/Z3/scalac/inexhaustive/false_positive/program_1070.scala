package Program_30 

package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[Int, T_B], b: T_B) extends T_A[Int, T_B]
case class CC_B(a: T_A[CC_A, (Int,Boolean)]) extends T_A[Int, T_B]
case class CC_C[C](a: Boolean, b: Byte) extends T_B
case class CC_D(a: (CC_B,T_B), b: T_A[Int, T_B], c: Int) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_C(_, 0) => 1 
  case CC_D(_, _, _) => 2 
  case CC_D(_, CC_A(_, _), 12) => 3 
  case CC_D((CC_B(_),CC_C(_, _)), CC_B(_), 12) => 4 
  case CC_D((CC_B(_),CC_C(_, _)), CC_B(_), _) => 5 
  case CC_D((CC_B(_),CC_C(_, _)), CC_A(_, _), _) => 6 
  case CC_D((CC_B(_),CC_C(_, _)), _, _) => 7 
}
}
// This is not matched: (CC_C T_B Wildcard Wildcard T_B)
// This is not matched: (CC_F (CC_B (CC_E Wildcard) (T_A (CC_E Wildcard))) Wildcard Wildcard (T_B Int))