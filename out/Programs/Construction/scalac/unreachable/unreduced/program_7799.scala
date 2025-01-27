package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[Int, T_A[Char, Byte]], C]
case class CC_B[D](a: Int, b: T_A[D, D]) extends T_A[T_A[Int, T_A[Char, Byte]], D]
case class CC_C[E]() extends T_A[T_A[Int, T_A[Char, Byte]], E]

val v_a: T_A[T_A[Int, T_A[Char, Byte]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}