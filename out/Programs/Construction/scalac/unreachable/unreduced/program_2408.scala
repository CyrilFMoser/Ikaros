package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: Byte) extends T_A[T_B, C]
case class CC_B[D](a: D, b: Int) extends T_A[T_B, D]
case class CC_C() extends T_B
case class CC_D() extends T_B
case class CC_E(a: T_A[T_B, Byte], b: (T_B,T_B), c: T_A[CC_A[T_B], CC_D]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D() => 1 
  case CC_E(_, _, _) => 2 
}
}