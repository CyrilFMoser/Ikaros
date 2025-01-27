package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: (Byte,Int)) extends T_A[T_B[Byte, Byte], E]
case class CC_B() extends T_A[T_B[Byte, Byte], CC_A[Boolean]]

val v_a: CC_A[CC_B] = null
val v_b: Int = v_a match{
  case CC_A((_,12)) => 0 
}
}
// This is not matched: (CC_A (CC_A T_B T_B T_B) Wildcard (T_A (CC_A T_B T_B T_B)))