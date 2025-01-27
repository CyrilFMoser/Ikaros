package Program_31 

package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_A[B]) extends T_A[B]
case class CC_B(a: T_B) extends T_A[T_B]
case class CC_C[C](a: C, b: C) extends T_B
case class CC_D(a: CC_B, b: T_A[CC_B]) extends T_B
case class CC_E(a: T_A[Char]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(_, CC_A(_)) => 1 
  case CC_E(CC_A(_)) => 2 
}
}
// This is not matched: (CC_C Boolean Wildcard Boolean T_B)
// This is not matched: (CC_C Boolean Wildcard Boolean T_B)