package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_B[T_A[Byte, Boolean], T_B[Char, Char]], E]
case class CC_B(a: T_B[(Boolean,Byte), (Boolean,Char)], b: T_A[(Boolean,Byte), CC_A[Int]]) extends T_A[T_B[T_A[Byte, Boolean], T_B[Char, Char]], Boolean]
case class CC_C[F](a: F, b: CC_A[F]) extends T_B[F, T_A[F, F]]

val v_a: T_B[T_A[T_B[T_A[Byte, Boolean], T_B[Char, Char]], Boolean], T_A[T_A[T_B[T_A[Byte, Boolean], T_B[Char, Char]], Boolean], T_A[T_B[T_A[Byte, Boolean], T_B[Char, Char]], Boolean]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(), _) => 0 
  case CC_C(CC_B(_, _), _) => 1 
}
}