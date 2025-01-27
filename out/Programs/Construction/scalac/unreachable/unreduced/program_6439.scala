package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Char, b: T_A[T_A[Char]], c: T_A[T_B[Char, Int]]) extends T_A[T_A[T_B[Int, Char]]]
case class CC_B(a: T_A[T_B[CC_A, CC_A]], b: T_A[T_A[CC_A]]) extends T_A[T_A[T_B[Int, Char]]]
case class CC_C(a: CC_B) extends T_A[T_A[T_B[Int, Char]]]
case class CC_D[E, D]() extends T_B[D, E]
case class CC_E[F]() extends T_B[T_B[F, F], F]
case class CC_F[H, G](a: T_B[G, G], b: G) extends T_B[G, H]

val v_a: T_B[T_B[CC_A, CC_A], CC_A] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E() => 1 
  case CC_F(CC_D(), CC_D()) => 2 
  case CC_F(CC_F(CC_D(), CC_D()), CC_D()) => 3 
  case CC_F(CC_F(CC_F(_, _), CC_D()), CC_D()) => 4 
  case CC_F(CC_F(CC_F(_, _), CC_F(_, _)), CC_D()) => 5 
  case CC_F(CC_D(), CC_F(_, CC_A(_, _, _))) => 6 
  case CC_F(CC_F(CC_D(), CC_D()), CC_F(_, CC_A(_, _, _))) => 7 
  case CC_F(CC_F(CC_F(_, _), CC_D()), CC_F(_, CC_A(_, _, _))) => 8 
  case CC_F(CC_F(CC_D(), CC_F(_, _)), CC_F(_, CC_A(_, _, _))) => 9 
  case CC_F(CC_F(CC_F(_, _), CC_F(_, _)), CC_F(_, CC_A(_, _, _))) => 10 
}
}
// This is not matched: CC_F(CC_F(CC_D(), CC_F(_, _)), CC_D())