package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: Int, b: T_B[C, C]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_B[CC_A[Byte], CC_A[T_A]], b: T_A, c: T_B[(CC_B,CC_B), T_B[Byte, CC_B]]) extends T_A
case class CC_D[D](a: Boolean, b: D, c: CC_A[D]) extends T_B[Int, D]
case class CC_E[E]() extends T_B[T_B[Int, E], E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_, CC_A(12, _), _) => 2 
  case CC_C(_, CC_A(_, _), _) => 3 
  case CC_C(_, CC_B(), _) => 4 
  case CC_C(_, CC_C(_, _, _), _) => 5 
}
}