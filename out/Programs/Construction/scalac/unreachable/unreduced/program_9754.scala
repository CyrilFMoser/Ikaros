package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_A[E, E]) extends T_A[Byte, E]
case class CC_B[F](a: CC_A[F], b: Int) extends T_A[T_A[T_A[Char, Char], (Char,Char)], F]
case class CC_C[G]() extends T_B[G, Int]
case class CC_D(a: CC_C[T_B[Boolean, Byte]], b: T_B[Byte, Int]) extends T_B[Byte, Int]
case class CC_E[H](a: T_B[H, Char]) extends T_B[H, Int]

val v_a: T_B[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_E(_) => 1 
}
}