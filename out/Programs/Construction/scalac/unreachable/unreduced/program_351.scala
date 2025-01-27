package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_A[T_B, Byte]]
case class CC_B[D](a: T_A[D, D]) extends T_A[D, T_A[T_B, Byte]]
case class CC_C(a: CC_A[CC_A[T_B]]) extends T_B

val v_a: T_A[Byte, T_A[T_B, Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}