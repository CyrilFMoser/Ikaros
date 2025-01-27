package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Char]], b: T_B[Byte], c: T_B[T_A[Char]]) extends T_A[T_A[T_B[Char]]]
case class CC_B() extends T_A[T_A[T_B[Char]]]
case class CC_C[C](a: Byte, b: CC_B) extends T_B[C]
case class CC_D[D](a: CC_A, b: CC_A, c: T_B[D]) extends T_B[D]
case class CC_E[E]() extends T_B[E]

val v_a: T_A[T_A[T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(_, _), CC_C(_, _)) => 0 
  case CC_A(_, CC_D(_, _, _), CC_C(_, _)) => 1 
  case CC_A(_, CC_E(), CC_C(_, _)) => 2 
  case CC_A(_, CC_C(_, _), CC_D(_, _, _)) => 3 
  case CC_A(_, CC_D(_, _, _), CC_D(_, _, _)) => 4 
  case CC_A(_, CC_E(), CC_D(_, _, _)) => 5 
  case CC_A(_, CC_C(_, _), CC_E()) => 6 
  case CC_A(_, CC_D(_, _, _), CC_E()) => 7 
  case CC_A(_, CC_E(), CC_E()) => 8 
  case CC_B() => 9 
}
}