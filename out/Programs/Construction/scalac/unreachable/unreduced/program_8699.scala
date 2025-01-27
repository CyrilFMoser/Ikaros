package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, T_A[E, E]], b: Char, c: T_A[E, T_A[E, E]]) extends T_A[E, T_A[E, E]]
case class CC_B[F](a: F) extends T_A[F, T_A[F, F]]
case class CC_C[G, H](a: T_B[G, G]) extends T_A[H, G]
case class CC_D[I](a: T_B[I, I]) extends T_B[I, T_A[CC_B[(Byte,Byte)], T_A[CC_B[(Byte,Byte)], CC_B[(Byte,Byte)]]]]
case class CC_E(a: Int, b: CC_D[CC_D[(Int,Boolean)]], c: CC_A[T_A[Char, Boolean]]) extends T_B[T_A[T_A[Boolean, Byte], T_A[T_A[Boolean, Byte], T_A[Boolean, Byte]]], CC_D[CC_B[Int]]]
case class CC_F() extends T_B[T_A[T_A[Boolean, Byte], T_A[T_A[Boolean, Byte], T_A[Boolean, Byte]]], CC_D[CC_B[Int]]]

val v_a: T_A[CC_F, T_A[CC_F, CC_F]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(CC_A(_, _, _), 'x', CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_A(CC_B(_), 'x', CC_A(_, _, _))) => 1 
  case CC_A(_, _, CC_A(CC_C(_), 'x', CC_A(_, _, _))) => 2 
  case CC_A(_, _, CC_A(CC_A(_, _, _), _, CC_A(_, _, _))) => 3 
  case CC_A(_, _, CC_A(CC_B(_), _, CC_A(_, _, _))) => 4 
  case CC_A(_, _, CC_A(CC_C(_), _, CC_A(_, _, _))) => 5 
  case CC_A(_, _, CC_A(CC_A(_, _, _), 'x', CC_B(_))) => 6 
  case CC_A(_, _, CC_A(CC_B(_), 'x', CC_B(_))) => 7 
  case CC_A(_, _, CC_A(CC_C(_), 'x', CC_B(_))) => 8 
  case CC_A(_, _, CC_A(CC_A(_, _, _), _, CC_B(_))) => 9 
  case CC_A(_, _, CC_A(CC_C(_), _, CC_B(_))) => 10 
  case CC_A(_, _, CC_A(CC_A(_, _, _), 'x', CC_C(_))) => 11 
  case CC_A(_, _, CC_A(CC_B(_), 'x', CC_C(_))) => 12 
  case CC_A(_, _, CC_A(CC_C(_), 'x', CC_C(_))) => 13 
  case CC_A(_, _, CC_A(CC_A(_, _, _), _, CC_C(_))) => 14 
  case CC_A(_, _, CC_A(CC_B(_), _, CC_C(_))) => 15 
  case CC_A(_, _, CC_A(CC_C(_), _, CC_C(_))) => 16 
  case CC_A(_, _, CC_B(CC_F())) => 17 
  case CC_A(_, _, CC_C(_)) => 18 
  case CC_B(CC_F()) => 19 
  case CC_C(_) => 20 
}
}
// This is not matched: CC_A(_, _, CC_A(CC_B(_), _, CC_B(_)))