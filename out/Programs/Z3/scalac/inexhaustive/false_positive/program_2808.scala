package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_A[D]) extends T_A[D]
case class CC_B() extends T_A[CC_A[Int]]
case class CC_C[E]() extends T_B[(Byte,CC_B), E]
case class CC_E[H]() extends T_B[(Byte,CC_B), H]

val v_a: T_A[CC_A[Int]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, CC_A(_, _)) => 1 
}
}
// This is not matched: (CC_A Byte (T_A Byte))