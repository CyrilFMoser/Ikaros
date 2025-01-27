package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[C, C], C]
case class CC_B[D](a: (CC_A[Int],T_A[Int, Char]), b: T_A[T_A[D, D], D]) extends T_A[T_A[D, D], D]
case class CC_C[E]() extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
  case CC_B(_, CC_B(_, CC_A())) => 2 
  case CC_B(_, CC_B((_,_), CC_B(_, _))) => 3 
  case CC_B(_, CC_B(_, CC_C())) => 4 
  case CC_B(_, CC_C()) => 5 
  case CC_C() => 6 
}
}