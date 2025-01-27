package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: T_B[T_B[T_A, C], C], b: T_A, c: T_B[C, C]) extends T_A
case class CC_B[D, E]() extends T_B[D, CC_A[T_B[T_A, T_A]]]
case class CC_C(a: Boolean, b: CC_A[CC_B[T_A, Byte]]) extends T_B[Boolean, CC_A[T_B[T_A, T_A]]]

val v_a: T_B[Boolean, CC_A[T_B[T_A, T_A]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(true, CC_A(_, CC_A(_, _, _), _)) => 1 
  case CC_C(false, CC_A(_, CC_A(_, _, _), _)) => 2 
}
}