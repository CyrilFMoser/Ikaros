package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, T_A[D, D]], b: (T_A[Byte, Char],T_A[Char, (Int,Byte)])) extends T_A[D, T_A[D, D]]
case class CC_B[E](a: Byte, b: T_A[E, T_A[E, E]]) extends T_A[E, T_A[E, E]]
case class CC_C[F]() extends T_A[F, T_A[F, F]]
case class CC_D() extends T_B[T_A[CC_A[Int], T_A[CC_A[Int], CC_A[Int]]]]
case class CC_E(a: T_B[(CC_D,CC_D)], b: T_A[Char, T_A[Char, Char]]) extends T_B[T_A[CC_A[Int], T_A[CC_A[Int], CC_A[Int]]]]
case class CC_F[G](a: T_A[G, T_B[G]], b: CC_E) extends T_B[T_A[CC_A[Int], T_A[CC_A[Int], CC_A[Int]]]]

val v_a: T_B[T_A[CC_A[Int], T_A[CC_A[Int], CC_A[Int]]]] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_, CC_A(_, _)) => 1 
  case CC_E(_, CC_B(_, _)) => 2 
  case CC_E(_, CC_C()) => 3 
  case CC_F(_, _) => 4 
}
}