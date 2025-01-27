package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[(T_A[Byte, Int],T_A[Char, Int]), C]
case class CC_B[D]() extends T_A[(T_A[Byte, Int],T_A[Char, Int]), D]
case class CC_C[E](a: T_A[E, CC_A[E]], b: Int) extends T_A[(T_A[Byte, Int],T_A[Char, Int]), E]

val v_a: T_A[(T_A[Byte, Int],T_A[Char, Int]), Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}