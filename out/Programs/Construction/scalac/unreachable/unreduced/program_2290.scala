package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char, b: T_A[C, C]) extends T_A[T_A[C, T_A[Byte, C]], C]
case class CC_B[D]() extends T_A[T_A[D, T_A[Byte, D]], D]

val v_a: T_A[T_A[Byte, T_A[Byte, Byte]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}