package Program_15 

package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B]() extends T_A[B]
case class CC_B[C]() extends T_A[C]
case class CC_C(a: T_A[Char], b: CC_B[T_B]) extends T_B
case class CC_D[D]() extends T_B
case class CC_E[E](a: E, b: CC_A[E]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_C(_, _) => 1 
  case CC_C(CC_B(), CC_B()) => 2 
  case CC_C(CC_A(), CC_B()) => 3 
  case CC_E(_, _) => 4 
  case CC_E(_, CC_A()) => 5 
}
}
// This is not matched: (CC_D T_B T_B)
// This is not matched: (CC_B Boolean Wildcard Wildcard (T_A Boolean))