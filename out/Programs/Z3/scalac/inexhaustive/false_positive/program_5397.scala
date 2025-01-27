package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B[C]() extends T_A[C]
case class CC_C(a: T_A[Byte]) extends T_A[T_A[Char]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_A()) => 0 
}
}
// This is not matched: (CC_A Byte (T_A Byte))