package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, (T_A[Byte, Int],Byte)]
case class CC_B[D](a: T_A[D, D], b: Byte) extends T_A[D, (T_A[Byte, Int],Byte)]
case class CC_C[E]() extends T_A[CC_B[CC_A[Char]], E]

val v_a: T_A[Boolean, (T_A[Byte, Int],Byte)] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}