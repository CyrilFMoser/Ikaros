package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[Byte, T_A[Byte]]]
case class CC_B(a: T_A[CC_A]) extends T_A[T_B[Byte, T_A[Byte]]]
case class CC_C() extends T_A[T_B[Byte, T_A[Byte]]]

val v_a: T_A[T_B[Byte, T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}