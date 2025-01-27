package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Int,T_A[Int, Int]), b: T_A[C, C]) extends T_A[T_A[T_A[Byte, Char], T_A[Byte, Byte]], C]
case class CC_B[D, E]() extends T_A[T_A[T_A[Byte, Char], T_A[Byte, Byte]], D]
case class CC_C[F](a: T_A[F, F], b: Char, c: Boolean) extends T_A[T_A[T_A[Byte, Char], T_A[Byte, Byte]], F]

val v_a: T_A[T_A[T_A[Byte, Char], T_A[Byte, Byte]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}