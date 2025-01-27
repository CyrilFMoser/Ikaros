package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_B[E](a: T_A[E, E], b: T_A[Int, Int]) extends T_A[Int, E]
case class CC_C[F]() extends T_A[Int, F]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_C()) => 0 
}
}
// This is not matched: (CC_A Boolean (T_A Boolean))