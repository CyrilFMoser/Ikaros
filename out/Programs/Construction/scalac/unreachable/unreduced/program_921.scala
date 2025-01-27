package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Byte, c: C) extends T_A[C, T_A[Byte, T_A[Char, Int]]]
case class CC_B[D, E](a: Char, b: CC_A[E]) extends T_A[D, T_A[Byte, T_A[Char, Int]]]
case class CC_C[F]() extends T_A[F, T_A[Byte, T_A[Char, Int]]]

val v_a: T_A[Byte, T_A[Byte, T_A[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, 0, _) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B(_, _) => 2 
  case CC_C() => 3 
}
}