package Program_31 

package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[T_A[C, C], C]
case class CC_B[D, E](a: D, b: CC_A[D]) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(_, _)) => 1 
  case CC_B(12, CC_A(_, _)) => 2 
}
}
// This is not matched: (CC_B Int Boolean Wildcard Wildcard (T_A (T_A Int Int) Int))
// This is not matched: (CC_B T_A)