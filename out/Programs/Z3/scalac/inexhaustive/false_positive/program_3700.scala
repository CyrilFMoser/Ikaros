package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C]() extends T_A[C, D]
case class CC_B[E](a: T_A[E, E], b: T_A[Int, Int]) extends T_A[Int, E]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, _)) => 0 
}
}
// This is not matched: (CC_A Boolean (T_A Boolean))