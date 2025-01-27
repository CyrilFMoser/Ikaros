package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E]) extends T_A[E, T_B[E, E]]
case class CC_B[F](a: CC_A[F]) extends T_A[F, T_B[F, F]]
case class CC_C(a: T_A[Int, T_B[Boolean, Char]], b: Int, c: Char) extends T_A[T_A[CC_B[Int], CC_B[Byte]], T_B[T_A[CC_B[Int], CC_B[Byte]], T_A[CC_B[Int], CC_B[Byte]]]]
case class CC_D[H, G](a: T_B[G, Char]) extends T_B[G, H]
case class CC_E[I](a: T_B[I, I], b: I, c: CC_A[I]) extends T_B[(CC_D[CC_C, CC_C],Byte), I]
case class CC_F[J]() extends T_B[(CC_D[CC_C, CC_C],Byte), J]

val v_a: T_B[(CC_D[CC_C, CC_C],Byte), Byte] = null
val v_b: Int = v_a match{
  case CC_D(CC_D(CC_D(_))) => 0 
  case CC_D(CC_D(CC_E(_, _, _))) => 1 
  case CC_D(CC_D(CC_F())) => 2 
  case CC_D(CC_E(_, _, CC_A(_))) => 3 
  case CC_D(CC_F()) => 4 
  case CC_E(CC_D(CC_D(_)), _, CC_A(_)) => 5 
  case CC_F() => 6 
}
}