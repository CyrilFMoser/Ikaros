package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: (T_A[Int],Byte), b: T_B[T_A[Int]], c: T_B[Char]) extends T_A[T_B[T_A[Byte]]]
case class CC_B[C]() extends T_B[C]
case class CC_C[D]() extends T_B[D]
case class CC_D[E](a: CC_C[E], b: E, c: (CC_A,CC_B[Char])) extends T_B[E]

val v_a: T_A[T_B[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B(), CC_B()) => 0 
  case CC_A(_, CC_B(), CC_C()) => 1 
  case CC_A(_, CC_B(), CC_D(CC_C(), _, _)) => 2 
  case CC_A(_, CC_C(), CC_B()) => 3 
  case CC_A(_, CC_C(), CC_C()) => 4 
  case CC_A(_, CC_C(), CC_D(CC_C(), _, _)) => 5 
  case CC_A(_, CC_D(CC_C(), _, _), CC_B()) => 6 
  case CC_A(_, CC_D(CC_C(), _, _), CC_D(CC_C(), _, _)) => 7 
}
}
// This is not matched: CC_A(_, CC_D(CC_C(), _, _), CC_C())