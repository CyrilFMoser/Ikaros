package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[Byte, C]
case class CC_B(a: T_A[T_A[T_B, T_B], CC_A[T_B]], b: Byte, c: T_A[Byte, (Byte,T_B)]) extends T_A[Byte, CC_A[T_B]]
case class CC_C(a: T_A[Byte, CC_A[T_B]], b: T_A[Byte, CC_A[T_B]], c: T_A[T_A[Byte, CC_B], CC_B]) extends T_B
case class CC_D() extends T_B

val v_a: T_A[Byte, CC_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, CC_A()) => 1 
}
}