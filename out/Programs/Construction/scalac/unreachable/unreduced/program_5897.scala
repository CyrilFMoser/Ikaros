package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B(a: Char, b: T_A[T_B[Char, Char]], c: Char) extends T_B[Byte, CC_A[T_B[Byte, Int]]]
case class CC_C(a: T_B[T_A[CC_B], CC_B], b: T_A[Byte]) extends T_B[Byte, CC_A[T_B[Byte, Int]]]
case class CC_D() extends T_B[Byte, CC_A[T_B[Byte, Int]]]

val v_a: T_B[Byte, CC_A[T_B[Byte, Int]]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(), _) => 0 
  case CC_C(_, CC_A()) => 1 
  case CC_D() => 2 
}
}