package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_A[Int, E]]
case class CC_B[F](a: T_A[F, T_A[Int, F]], b: T_A[F, T_A[Int, F]]) extends T_A[F, T_A[Int, F]]
case class CC_C[G](a: T_A[G, T_A[Int, G]], b: T_A[G, G]) extends T_A[G, T_A[Int, G]]
case class CC_D(a: Int, b: T_B[CC_A[Boolean], T_B[Char, Char]]) extends T_B[T_A[CC_A[Int], T_A[Int, CC_A[Int]]], (T_B[Int, Char],Byte)]
case class CC_E(a: Char, b: T_A[(CC_D,CC_D), T_A[Int, (CC_D,CC_D)]]) extends T_B[T_A[CC_A[Int], T_A[Int, CC_A[Int]]], (T_B[Int, Char],Byte)]
case class CC_F(a: CC_B[T_A[CC_E, CC_E]], b: Byte) extends T_B[T_A[CC_A[Int], T_A[Int, CC_A[Int]]], (T_B[Int, Char],Byte)]

val v_a: T_B[T_A[CC_A[Int], T_A[Int, CC_A[Int]]], (T_B[Int, Char],Byte)] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_F(CC_B(_, CC_A()), _) => 1 
  case CC_F(CC_B(_, CC_B(_, _)), _) => 2 
  case CC_F(CC_B(_, CC_C(_, _)), _) => 3 
}
}
// This is not matched: CC_E(_, _)