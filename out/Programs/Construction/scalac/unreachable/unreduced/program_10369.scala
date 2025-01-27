package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[T_A[Byte, Int], T_A[Int, Char]], C]
case class CC_B[D, E]() extends T_A[T_A[T_A[Byte, Int], T_A[Int, Char]], D]
case class CC_C[F]() extends T_A[T_A[T_A[Byte, Int], T_A[Int, Char]], F]

val v_a: T_A[T_A[T_A[Byte, Int], T_A[Int, Char]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}