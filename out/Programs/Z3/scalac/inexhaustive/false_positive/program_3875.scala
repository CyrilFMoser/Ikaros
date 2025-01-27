package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, Int]
case class CC_B[E]() extends T_A[E, Int]
case class CC_D(a: Int, b: T_A[Boolean, Int]) extends T_B[T_A[Int, Int]]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A()) => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard (T_A (T_A (CC_A Boolean))))