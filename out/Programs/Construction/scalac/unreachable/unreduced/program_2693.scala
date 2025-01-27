package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: Byte, c: Char) extends T_A[Byte, C]
case class CC_B[D]() extends T_A[Byte, D]
case class CC_C[E]() extends T_A[Byte, E]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, 0, _) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B() => 2 
  case CC_C() => 3 
}
}