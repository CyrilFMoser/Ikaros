package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[Int, T_A[Byte, Boolean]]]
case class CC_B[D](a: T_A[D, D], b: CC_A[D]) extends T_A[D, T_A[Int, T_A[Byte, Boolean]]]
case class CC_C[E]() extends T_A[E, T_A[Int, T_A[Byte, Boolean]]]

val v_a: T_A[Boolean, T_A[Int, T_A[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A()) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A()