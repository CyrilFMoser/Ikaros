package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F](a: T_B[F, CC_A[Char]], b: T_A[F]) extends T_A[F]
case class CC_D[G](a: G) extends T_B[G, Int]
case class CC_E[H](a: Char, b: CC_A[H], c: CC_B[H]) extends T_B[H, Int]
case class CC_F[I](a: Int, b: (T_A[Boolean],((Boolean,Boolean),Int)), c: Boolean) extends T_B[I, CC_C[(Boolean,(Byte,Byte))]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B()) => 1 
  case CC_A(CC_C(_, CC_B())) => 2 
  case CC_A(CC_C(_, CC_C(_, _))) => 3 
  case CC_B() => 4 
  case CC_C(_, CC_A(CC_A(_))) => 5 
  case CC_C(_, CC_A(CC_B())) => 6 
  case CC_C(_, CC_A(CC_C(_, _))) => 7 
  case CC_C(_, CC_B()) => 8 
  case CC_C(_, CC_C(_, CC_A(_))) => 9 
  case CC_C(_, CC_C(_, CC_B())) => 10 
  case CC_C(_, CC_C(_, CC_C(_, _))) => 11 
}
}
// This is not matched: CC_A(CC_C(_, CC_A(_)))