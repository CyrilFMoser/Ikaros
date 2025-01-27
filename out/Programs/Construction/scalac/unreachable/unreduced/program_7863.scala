package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[T_B[D], D], b: (T_B[Byte],T_A[Char, Boolean]), c: D) extends T_A[T_B[D], D]
case class CC_B(a: T_A[T_B[T_A[Byte, Boolean]], T_A[Byte, Boolean]], b: T_A[T_B[Boolean], CC_A[Boolean]], c: CC_A[((Byte,Char),Int)]) extends T_A[T_B[T_B[Char]], T_B[Char]]
case class CC_C[E, F](a: CC_B, b: T_B[E]) extends T_A[T_B[E], E]
case class CC_D[G](a: CC_B, b: G) extends T_B[G]
case class CC_E[H](a: Boolean) extends T_B[H]
case class CC_F[I](a: CC_A[I], b: Byte, c: T_A[I, I]) extends T_B[I]

val v_a: T_A[T_B[T_B[Char]], T_B[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), _, CC_A(_, _, (_,_))) => 1 
  case CC_B(CC_C(_, _), _, CC_A(_, _, (_,_))) => 2 
  case CC_C(CC_B(_, _, CC_A(_, _, _)), CC_D(CC_B(_, _, _), CC_D(_, _))) => 3 
  case CC_C(CC_B(_, _, CC_A(_, _, _)), CC_D(CC_B(_, _, _), CC_E(_))) => 4 
  case CC_C(CC_B(_, _, CC_A(_, _, _)), CC_D(CC_B(_, _, _), CC_F(_, _, _))) => 5 
  case CC_C(CC_B(_, _, CC_A(_, _, _)), CC_E(_)) => 6 
}
}
// This is not matched: CC_C(CC_B(_, _, CC_A(_, _, _)), CC_F(_, _, _))