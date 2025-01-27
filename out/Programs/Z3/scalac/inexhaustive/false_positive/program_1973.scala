package Program_31 

package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[T_A[Int]]
case class CC_B(a: CC_A[Int], b: CC_A[Char], c: T_A[Byte]) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_B(_, CC_A(), _) => 2 
  case CC_B(CC_A(), _, _) => 3 
}
}
// This is not matched: (CC_A Boolean (T_A (T_A Int)))
// This is not matched: (CC_A Boolean (T_A (T_A Int)))