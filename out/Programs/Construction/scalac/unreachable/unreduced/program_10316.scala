package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, Byte]], b: T_A[(Byte,Int), C]) extends T_A[(T_A[Int, Char],T_A[Char, Char]), C]
case class CC_B[D]() extends T_A[(T_A[Int, Char],T_A[Char, Char]), D]

val v_a: T_A[(T_A[Int, Char],T_A[Char, Char]), Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}