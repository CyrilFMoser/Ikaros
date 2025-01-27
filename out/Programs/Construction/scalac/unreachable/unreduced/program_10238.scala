package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[(T_A[Int, Char],(Int,Char)), C]
case class CC_B[D]() extends T_A[(T_A[Int, Char],(Int,Char)), D]
case class CC_C[E](a: Byte, b: CC_B[E], c: T_A[E, E]) extends T_A[(T_A[Int, Char],(Int,Char)), E]

val v_a: T_A[(T_A[Int, Char],(Int,Char)), Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}