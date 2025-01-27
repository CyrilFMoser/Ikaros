package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_A[E, E], E]
case class CC_B[F](a: T_A[F, F], b: (T_B[Int, Char],Byte)) extends T_A[T_A[F, F], F]
case class CC_C[H, G](a: G, b: T_A[T_A[H, H], H]) extends T_A[G, H]
case class CC_D[I](a: (T_A[(Boolean,Char), Char],T_A[Char, Byte]), b: T_B[T_A[I, I], I]) extends T_B[T_A[I, I], I]
case class CC_E() extends T_B[T_A[T_A[T_A[T_A[Byte, Char], T_A[Byte, Char]], T_A[Byte, Char]], T_A[T_A[T_A[Byte, Char], T_A[Byte, Char]], T_A[Byte, Char]]], T_A[T_A[T_A[Byte, Char], T_A[Byte, Char]], T_A[Byte, Char]]]
case class CC_F[J](a: T_A[J, J]) extends T_B[J, Byte]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_C(_, _), (_,_)) => 1 
  case CC_C(CC_C(_, CC_A()), CC_A()) => 2 
  case CC_C(CC_C(_, CC_A()), CC_B(_, _)) => 3 
  case CC_C(CC_C(_, CC_A()), CC_C(CC_C(_, _), CC_B(_, _))) => 4 
  case CC_C(CC_C(_, CC_A()), CC_C(CC_C(_, _), CC_C(_, _))) => 5 
  case CC_C(CC_C(_, CC_B(_, _)), CC_A()) => 6 
  case CC_C(CC_C(_, CC_B(_, _)), CC_B(_, _)) => 7 
  case CC_C(CC_C(_, CC_B(_, _)), CC_C(CC_C(_, _), CC_A())) => 8 
  case CC_C(CC_C(_, CC_B(_, _)), CC_C(CC_C(_, _), CC_B(_, _))) => 9 
  case CC_C(CC_C(_, CC_B(_, _)), CC_C(CC_C(_, _), CC_C(_, _))) => 10 
  case CC_C(CC_C(_, CC_C(_, _)), CC_A()) => 11 
  case CC_C(CC_C(_, CC_C(_, _)), CC_B(_, _)) => 12 
  case CC_C(CC_C(_, CC_C(_, _)), CC_C(CC_C(_, _), CC_A())) => 13 
  case CC_C(CC_C(_, CC_C(_, _)), CC_C(CC_C(_, _), CC_B(_, _))) => 14 
  case CC_C(CC_C(_, CC_C(_, _)), CC_C(CC_C(_, _), CC_C(_, _))) => 15 
}
}
// This is not matched: CC_C(CC_C(_, CC_A()), CC_C(CC_C(_, _), CC_A()))