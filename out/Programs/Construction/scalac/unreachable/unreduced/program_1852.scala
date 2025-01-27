package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[T_A[E, E], E]) extends T_A[E, T_A[Boolean, Int]]
case class CC_B[F](a: F) extends T_A[F, T_A[Boolean, Int]]
case class CC_C[G](a: T_A[G, T_A[Boolean, Int]], b: G) extends T_A[G, T_A[Boolean, Int]]
case class CC_D[H](a: CC_C[H]) extends T_B[H, T_A[CC_A[Int], T_A[Boolean, Int]]]
case class CC_E[I]() extends T_B[I, CC_D[I]]
case class CC_F(a: Byte, b: T_A[CC_E[Char], CC_B[Boolean]], c: CC_A[T_A[Boolean, Char]]) extends T_B[(CC_C[Byte],T_B[Int, Boolean]), T_A[CC_A[Int], T_A[Boolean, Int]]]

val v_a: T_A[Char, T_A[Boolean, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C(_, _)