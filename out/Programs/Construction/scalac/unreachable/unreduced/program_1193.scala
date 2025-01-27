package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_A[T_B[Char, Boolean], T_B[Byte, Byte]]]
case class CC_B[F](a: T_A[F, F]) extends T_A[F, T_A[T_B[Char, Boolean], T_B[Byte, Byte]]]
case class CC_C(a: Char, b: CC_B[T_B[Byte, Byte]], c: T_B[T_B[Char, Char], T_A[Char, Int]]) extends T_B[CC_A[(Boolean,Byte)], CC_A[T_B[Byte, Boolean]]]

val v_a: T_A[Char, T_A[T_B[Char, Boolean], T_B[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}