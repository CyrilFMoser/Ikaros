package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: C, c: T_A[C, C]) extends T_A[C, T_A[T_A[Byte, Char], T_A[Byte, Boolean]]]
case class CC_B[D, E]() extends T_A[D, T_A[T_A[Byte, Char], T_A[Byte, Boolean]]]
case class CC_C[F](a: Int, b: F, c: T_A[F, Int]) extends T_A[F, T_A[T_A[Byte, Char], T_A[Byte, Boolean]]]

val v_a: T_A[Int, T_A[T_A[Byte, Char], T_A[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}