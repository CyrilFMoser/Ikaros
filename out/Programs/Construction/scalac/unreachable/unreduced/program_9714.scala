package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: T_A[T_B[Byte]]) extends T_A[T_A[T_A[Byte]]]
case class CC_C() extends T_B[Byte]
case class CC_D[C]() extends T_B[C]
case class CC_E(a: Char, b: CC_B, c: T_B[T_B[Byte]]) extends T_B[Byte]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_, CC_B(_), CC_D()) => 1 
}
}
// This is not matched: CC_C()