package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: T_B[T_A[D, D]], c: T_A[D, D]) extends T_A[T_B[T_B[Char]], D]
case class CC_B[E](a: E, b: T_A[T_B[E], E], c: Boolean) extends T_A[T_B[T_B[Char]], E]
case class CC_C(a: T_A[CC_A[Char], T_A[Byte, Char]], b: T_A[T_B[Int], T_B[Char]]) extends T_B[Boolean]
case class CC_D[F, G](a: T_B[(Int,CC_C)], b: CC_A[CC_A[F]], c: CC_A[F]) extends T_B[F]
case class CC_E(a: CC_B[CC_A[(Char,Byte)]], b: CC_A[Boolean]) extends T_B[Boolean]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(_, _, _) => 1 
  case CC_E(_, _) => 2 
}
}