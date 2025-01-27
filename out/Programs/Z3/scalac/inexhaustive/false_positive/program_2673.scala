package Program_31 

package Program_0 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[Char]]
case class CC_B[B](a: CC_A, b: T_A[CC_A]) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _) => 1 
  case CC_B(_, _) => 2 
}
}
// This is not matched: (CC_B Boolean (CC_A (T_A (T_A Char))) Wildcard (T_A (T_A Char)))
// This is not matched: (CC_B T_B)