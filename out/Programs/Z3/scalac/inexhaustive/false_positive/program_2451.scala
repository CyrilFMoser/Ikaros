package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: T_B[E, E], b: T_A[E]) extends T_A[E]
case class CC_C[F]() extends T_B[F, T_A[Int]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_B(_, _)) => 1 
}
}
// This is not matched: (CC_C Wildcard Wildcard T_A)