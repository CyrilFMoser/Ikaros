package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, T_B[E, E]]) extends T_A[E, Char]
case class CC_B[F](a: T_A[F, F], b: T_B[F, F]) extends T_A[F, Char]
case class CC_C[G]() extends T_A[G, Char]
case class CC_D[H, I](a: T_A[I, Char], b: T_A[I, Char]) extends T_B[I, H]
case class CC_E(a: (T_B[Boolean, Int],(Boolean,Byte))) extends T_B[T_B[(Byte,Boolean), T_A[Byte, Char]], (T_A[Byte, Char],CC_A[Char])]
case class CC_F[J, K]() extends T_B[J, K]

val v_a: T_B[T_B[(Byte,Boolean), T_A[Byte, Char]], (T_A[Byte, Char],CC_A[Char])] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(CC_D(_, _))) => 0 
  case CC_D(_, CC_A(CC_F())) => 1 
  case CC_D(_, CC_B(_, _)) => 2 
  case CC_D(_, CC_C()) => 3 
  case CC_E(_) => 4 
  case CC_F() => 5 
}
}