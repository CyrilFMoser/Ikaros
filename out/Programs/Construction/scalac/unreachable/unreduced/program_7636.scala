package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: C, c: T_A[C, T_B]) extends T_A[T_A[T_B, C], C]
case class CC_B[D]() extends T_A[T_A[T_B, D], D]
case class CC_C(a: CC_A[CC_A[T_B]], b: (CC_B[T_B],T_A[T_B, T_B])) extends T_A[T_B, T_A[CC_A[T_B], CC_B[T_B]]]
case class CC_D(a: T_A[Byte, Byte], b: Char) extends T_B
case class CC_E() extends T_B
case class CC_F(a: CC_C) extends T_B

val v_a: T_A[T_A[T_B, CC_D], CC_D] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_, _), CC_D(_, _), _) => 0 
  case CC_B() => 1 
}
}