package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: T_A[C, C]) extends T_A[(Byte,T_A[Boolean, Int]), C]
case class CC_B[D]() extends T_A[(Byte,T_A[Boolean, Int]), D]
case class CC_C[E](a: CC_A[E], b: E, c: Byte) extends T_A[(Byte,T_A[Boolean, Int]), E]

val v_a: T_A[(Byte,T_A[Boolean, Int]), Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}