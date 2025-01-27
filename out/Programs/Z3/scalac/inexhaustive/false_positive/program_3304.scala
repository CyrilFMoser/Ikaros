package Program_15 

package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[T_A[Int, Int], C]
case class CC_B[E](a: CC_A[E, E]) extends T_A[T_A[Int, Int], E]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A()) => 1 
}
}
// This is not matched: (CC_A Int Boolean (T_A (T_A Int Int) Int))
// This is not matched: (CC_C Boolean Int (T_A Boolean Int))