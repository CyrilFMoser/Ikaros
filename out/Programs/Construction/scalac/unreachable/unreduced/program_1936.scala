package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[(T_A[Boolean, Int],T_A[Byte, Int]), C]
case class CC_B(a: CC_A[CC_A[Byte]], b: Char, c: CC_A[(Int,Int)]) extends T_A[(T_A[Boolean, Int],T_A[Byte, Int]), CC_A[(Char,Int)]]
case class CC_C[D]() extends T_A[(T_A[Boolean, Int],T_A[Byte, Int]), D]

val v_a: T_A[(T_A[Boolean, Int],T_A[Byte, Int]), Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C() => 1 
}
}