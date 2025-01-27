package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: Byte) extends T_A[T_A[T_B, T_B], C]
case class CC_B() extends T_B

val v_a: T_A[T_A[T_B, T_B], CC_B] = null
val v_b: Int = v_a match{
  case CC_A(_, 0) => 0 
}
}
// This is not matched: (CC_A Wildcard T_A)