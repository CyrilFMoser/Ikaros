package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Boolean, Boolean], (Char,Char)], b: T_A[Int]) extends T_A[T_B[T_A[Int], T_B[Char, Char]]]
case class CC_B() extends T_A[Byte]
case class CC_C(a: T_A[T_A[Byte]]) extends T_A[Byte]
case class CC_D[D](a: CC_C, b: Int, c: Char) extends T_B[T_B[D, D], D]
case class CC_E[E]() extends T_B[T_B[E, E], E]
case class CC_F[F](a: T_A[F], b: F, c: Byte) extends T_B[T_B[F, F], F]

val v_a: T_B[T_B[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(_), _, _) => 0 
  case CC_E() => 1 
  case CC_F(_, _, _) => 2 
}
}