package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[Byte, C]) extends T_A[T_A[Char, T_A[Byte, Byte]], C]
case class CC_B[D]() extends T_A[T_A[Char, T_A[Byte, Byte]], D]

val v_a: T_A[T_A[Char, T_A[Byte, Byte]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}