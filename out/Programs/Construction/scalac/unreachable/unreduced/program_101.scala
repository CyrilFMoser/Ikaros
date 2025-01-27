package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_A[T_A[Byte]]]
case class CC_B[C](a: T_A[C], b: T_B[C]) extends T_B[C]
case class CC_C[D]() extends T_B[D]

val v_a: T_B[T_A[T_A[T_A[Byte]]]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, _)) => 0 
  case CC_B(_, CC_C()) => 1 
  case CC_C() => 2 
}
}