package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B]() extends T_A[B]
case class CC_B[C]() extends T_A[C]
case class CC_C(a: (T_B,Byte), b: T_A[T_B]) extends T_A[T_A[T_B]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A()) => 0 
}
}
// This is not matched: (CC_A Byte (T_A (T_A Boolean Byte) Byte))