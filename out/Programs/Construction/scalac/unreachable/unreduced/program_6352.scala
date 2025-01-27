package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_A[D, D], b: Int) extends T_A[T_A[D, D], D]
case class CC_C(a: (Char,CC_B[T_B]), b: T_B) extends T_B
case class CC_D(a: Byte, b: Char, c: T_A[T_A[CC_C, CC_C], CC_C]) extends T_B
case class CC_E(a: CC_C) extends T_B

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}