package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_A[Char, T_A[Byte, T_B]]]
case class CC_B[D](a: T_A[D, D], b: T_B, c: (T_B,T_B)) extends T_A[D, T_A[Char, T_A[Byte, T_B]]]
case class CC_C[E]() extends T_A[E, T_A[Char, T_A[Byte, T_B]]]
case class CC_D(a: T_A[CC_A[(Char,Boolean)], (T_B,T_B)]) extends T_B
case class CC_E(a: CC_D, b: Boolean) extends T_B
case class CC_F[F](a: CC_B[F], b: CC_D) extends T_B

val v_a: T_A[T_B, T_A[Char, T_A[Byte, T_B]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C()