package Program_31 

package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[T_A[Int]]
case class CC_B[F, E](a: T_A[E]) extends T_B[F, E]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Boolean (T_A (T_A Int)))
// This is not matched: (CC_A Wildcard Wildcard T_A)