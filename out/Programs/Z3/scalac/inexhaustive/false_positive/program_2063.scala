package Program_30 

package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_B]
case class CC_B[B, C](a: T_A[B], b: Char) extends T_A[B]
case class CC_C(a: Char, b: (T_B,T_B), c: T_A[CC_A]) extends T_A[Boolean]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C('x', _, CC_B(_, _)) => 0 
  case CC_C(_, _, CC_B(_, _)) => 1 
}
}
// This is not matched: (CC_C Wildcard
//      Wildcard
//      (CC_B (CC_A T_B)
//            T_B
//            (CC_B (CC_A T_B) T_B Wildcard Char (T_A (CC_A T_B)))
//            Wildcard
//            (T_A (CC_A T_B)))
//      (T_A Boolean))
// This is not matched: (CC_D Int (T_B Int Int))