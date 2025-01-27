package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_A[B], b: Byte) extends T_A[Byte]
case class CC_B(a: (CC_A[T_B],CC_A[T_B]), b: T_A[Byte], c: T_A[T_A[Byte]]) extends T_A[Byte]
case class CC_C() extends T_A[Byte]
case class CC_D(a: CC_A[CC_B], b: CC_A[T_A[Byte]]) extends T_B
case class CC_E(a: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _), _) => 0 
  case CC_E(CC_C()) => 1 
}
}