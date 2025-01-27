package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[D]
case class CC_A[E](a: Int, b: T_B[E]) extends T_A[E]
case class CC_D[G]() extends T_B[T_B[G]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(12, _) => 0 
}
}
// This is not matched: (CC_D T_B)