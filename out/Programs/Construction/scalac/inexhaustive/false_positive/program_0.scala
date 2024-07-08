object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[T_A[Byte, Byte], T_A[Int, Byte]], b: T_A[T_B[Boolean, Int], (Char,Boolean)]) extends T_A[T_B[Byte, Char], T_A[Int, T_A[Char, Boolean]]]
case class CC_B(a: Boolean, b: CC_A, c: CC_A) extends T_A[T_B[Byte, Char], T_A[Int, T_A[Char, Boolean]]]
case class CC_C[F, E](a: T_A[F, E], b: Int) extends T_B[F, E]
case class CC_D[H, G](a: T_B[G, G]) extends T_B[H, G]

val v_a: T_A[T_B[Byte, Char], T_A[Int, T_A[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_), _) => 0 
  case CC_B(_, CC_A(_, _), _) => 1 
}
}// Removed this case: CC_A(CC_C(_, _), _)
