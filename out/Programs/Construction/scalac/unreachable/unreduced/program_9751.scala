package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[T_B[(Byte,Boolean)], T_B[Byte]], b: T_A[T_A[Byte, Char], T_B[Char]]) extends T_A[(T_A[Int, Byte],T_A[Byte, Char]), T_A[T_B[Char], T_A[Byte, Boolean]]]
case class CC_B() extends T_A[(T_A[Int, Byte],T_A[Byte, Char]), T_A[T_B[Char], T_A[Byte, Boolean]]]
case class CC_C(a: CC_A, b: Int) extends T_A[(T_A[Int, Byte],T_A[Byte, Char]), T_A[T_B[Char], T_A[Byte, Boolean]]]
case class CC_D[D]() extends T_B[D]
case class CC_E[E](a: E, b: CC_B, c: T_B[E]) extends T_B[E]
case class CC_F[F](a: T_B[F], b: CC_A, c: CC_B) extends T_B[F]

val v_a: T_A[(T_A[Int, Byte],T_A[Byte, Char]), T_A[T_B[Char], T_A[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_, 12) => 2 
  case CC_C(_, _) => 3 
}
}