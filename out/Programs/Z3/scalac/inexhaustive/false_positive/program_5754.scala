package Program_15 

package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Char, b: T_B[T_A], c: T_A) extends T_A
case class CC_B(a: Boolean, b: T_B[Boolean]) extends T_A
case class CC_C[B, C](a: CC_B, b: (T_A,CC_B), c: C) extends T_B[B]
case class CC_D(a: Int, b: T_A, c: CC_C[CC_B, CC_A]) extends T_B[T_B[CC_A]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_C(_, _, _)) => 0 
}
}
// This is not matched: (CC_B Wildcard
//      (CC_C Boolean Boolean Wildcard Wildcard Boolean (T_B Boolean))
//      T_A)
// This is not matched: (CC_B T_A)