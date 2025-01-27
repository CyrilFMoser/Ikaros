package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_A[E, E], b: T_A[E, E], c: T_B[T_A[E, E], E]) extends T_A[E, F]
case class CC_B[G](a: T_B[G, CC_A[G, Int]], b: T_A[G, G]) extends T_A[T_B[CC_A[Byte, Char], CC_A[Byte, Int]], G]
case class CC_C[H](a: T_A[H, H], b: (T_A[Byte, Char],T_A[Int, Boolean])) extends T_B[T_A[H, H], H]
case class CC_D[I](a: T_B[I, I]) extends T_B[T_A[I, I], I]

val v_a: T_B[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_C(_, _)), (CC_A(_, _, _),CC_A(_, _, _))) => 0 
  case CC_C(CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_D(_)), (CC_A(_, _, _),CC_A(_, _, _))) => 1 
  case CC_D(_) => 2 
}
}