package Program_22 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[T_A[Byte]]
case class CC_B() extends T_A[T_A[Byte]]
case class CC_C(a: T_A[Byte], b: T_A[T_A[Byte]]) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(_, CC_A()) => 2 
  case CC_C(_, CC_B()) => 3 
  case CC_C(_, CC_C(_, CC_A())) => 4 
  case CC_C(_, CC_C(_, CC_B())) => 5 
  case CC_C(_, CC_C(_, CC_C(_, _))) => 6 
}
}