package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[Byte, C], b: T_A[C, C], c: Char) extends T_A[Byte, C]
case class CC_B[D](a: CC_A[D], b: T_A[Byte, D], c: D) extends T_A[Byte, D]
case class CC_C[E]() extends T_A[Byte, E]

val v_a: T_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}