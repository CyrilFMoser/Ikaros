package Program_31 

package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Boolean, b: T_B[Int]) extends T_A
case class CC_B[B, C](a: Char, b: C, c: CC_A) extends T_B[B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B(_, _, _)) => 0 
}
}
// This is not matched: (CC_A Wildcard
//      (CC_B Int Boolean Wildcard Boolean (CC_A Boolean Wildcard T_A) (T_B Int))
//      T_A)
// This is not matched: (CC_B Wildcard T_A)