package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_A[T_B, Boolean], C]
case class CC_B[D]() extends T_A[D, CC_A[T_B]]
case class CC_C[E](a: E, b: CC_B[E]) extends T_A[E, CC_A[T_B]]
case class CC_D(a: T_A[T_A[T_B, Boolean], Byte], b: Byte, c: Byte) extends T_B

val v_a: T_A[T_A[T_B, Boolean], CC_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}