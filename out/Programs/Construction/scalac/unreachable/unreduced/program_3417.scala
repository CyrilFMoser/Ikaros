package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Char, T_A[Char]], b: T_B[T_B[(Byte,Boolean), Boolean], T_B[Int, Byte]], c: T_A[T_B[Boolean, Char]]) extends T_A[(T_B[Int, Boolean],T_B[Char, Boolean])]
case class CC_B(a: T_B[CC_A, T_B[CC_A, CC_A]]) extends T_A[(T_B[Int, Boolean],T_B[Char, Boolean])]
case class CC_C(a: Byte, b: T_A[Int], c: Byte) extends T_A[(T_B[Int, Boolean],T_B[Char, Boolean])]
case class CC_D[E, D](a: T_B[D, T_B[E, D]]) extends T_B[E, D]
case class CC_E[F]() extends T_B[CC_A, F]
case class CC_F[G](a: G, b: Char) extends T_B[CC_A, G]

val v_a: T_A[(T_B[Int, Boolean],T_B[Char, Boolean])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_D(_)) => 1 
  case CC_B(CC_E()) => 2 
  case CC_B(CC_F(_, _)) => 3 
  case CC_C(_, _, 0) => 4 
}
}
// This is not matched: CC_C(_, _, _)