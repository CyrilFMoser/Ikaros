package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[(Char,T_A[Boolean, Int]), C]
case class CC_B(a: Byte, b: T_A[Boolean, T_A[Char, Boolean]], c: CC_A[T_A[(Int,Boolean), Int]]) extends T_A[(Char,T_A[Boolean, Int]), Byte]
case class CC_C[D]() extends T_A[(Char,T_A[Boolean, Int]), D]

val v_a: T_A[(Char,T_A[Boolean, Int]), Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C() => 1 
}
}