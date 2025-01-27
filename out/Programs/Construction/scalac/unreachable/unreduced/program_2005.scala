package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: Byte) extends T_A[Byte, C]
case class CC_B(a: T_A[T_A[Byte, Int], Int]) extends T_A[Byte, Boolean]
case class CC_C[D]() extends T_A[Byte, D]

val v_a: T_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}