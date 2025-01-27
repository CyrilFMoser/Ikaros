package Program_31 

package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[C, T_B]
case class CC_B() extends T_A[T_A[T_B, T_B], T_B]
case class CC_C() extends T_A[T_A[T_B, T_B], T_B]
case class CC_D[D](a: T_A[Boolean, D]) extends T_B
case class CC_E(a: CC_D[CC_B], b: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E(_, CC_C()) => 1 
  case CC_E(CC_D(_), _) => 2 
}
}
// This is not matched: (CC_D T_B (CC_A Boolean Wildcard (T_A Boolean T_B)) T_B)
// This is not matched: (CC_C Wildcard Wildcard Wildcard T_A)