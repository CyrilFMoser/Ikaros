package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_A[Byte, (Boolean,T_B)]]
case class CC_B[D](a: T_A[D, D], b: CC_A[D], c: T_A[CC_A[D], D]) extends T_A[D, T_A[Byte, (Boolean,T_B)]]
case class CC_C[E]() extends T_A[CC_B[T_A[Byte, T_B]], E]
case class CC_D() extends T_B

val v_a: T_A[Boolean, T_A[Byte, (Boolean,T_B)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}