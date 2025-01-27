package Program_15 

package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[Boolean]]
case class CC_B[B, C](a: T_A[B], b: T_A[Byte]) extends T_A[B]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _) => 1 
  case CC_B(CC_B(_, _), _) => 2 
  case CC_B(_, CC_B(_, _)) => 3 
  case CC_B(_, _) => 4 
}
}
// This is not matched: (CC_B (T_A Boolean) Boolean Wildcard Wildcard (T_A (T_A Boolean)))
// This is not matched: (CC_B Wildcard (T_A Int (T_A Char Char)))