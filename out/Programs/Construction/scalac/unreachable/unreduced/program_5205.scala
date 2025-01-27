package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C], c: T_A[C, C]) extends T_A[(Byte,T_A[Int, Byte]), C]
case class CC_B[D]() extends T_A[(Byte,T_A[Int, Byte]), D]
case class CC_C[E]() extends T_A[(Byte,T_A[Int, Byte]), E]

val v_a: T_A[(Byte,T_A[Int, Byte]), Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}