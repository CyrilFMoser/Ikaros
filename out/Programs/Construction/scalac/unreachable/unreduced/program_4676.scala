package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: T_A[D, D], c: Char) extends T_A[D, T_A[D, D]]
case class CC_B[E](a: CC_A[E]) extends T_A[T_A[CC_A[(Boolean,Char)], T_A[CC_A[(Boolean,Char)], CC_A[(Boolean,Char)]]], T_A[T_A[CC_A[(Boolean,Char)], T_A[CC_A[(Boolean,Char)], CC_A[(Boolean,Char)]]], T_A[CC_A[(Boolean,Char)], T_A[CC_A[(Boolean,Char)], CC_A[(Boolean,Char)]]]]]
case class CC_C(a: T_A[CC_B[Boolean], T_A[CC_B[Boolean], CC_B[Boolean]]], b: CC_B[T_B[Boolean]]) extends T_A[T_A[CC_A[(Boolean,Char)], T_A[CC_A[(Boolean,Char)], CC_A[(Boolean,Char)]]], T_A[T_A[CC_A[(Boolean,Char)], T_A[CC_A[(Boolean,Char)], CC_A[(Boolean,Char)]]], T_A[CC_A[(Boolean,Char)], T_A[CC_A[(Boolean,Char)], CC_A[(Boolean,Char)]]]]]
case class CC_D[F](a: CC_A[F], b: CC_B[F]) extends T_B[F]
case class CC_E[G](a: CC_C, b: G, c: T_B[CC_D[CC_B[CC_C]]]) extends T_B[G]
case class CC_F[I](a: I, b: (Char,CC_C)) extends T_B[I]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _, _), CC_B(CC_A(_, _, _))) => 0 
  case CC_E(_, true, CC_D(_, CC_B(_))) => 1 
  case CC_E(_, false, CC_D(_, CC_B(_))) => 2 
  case CC_E(_, true, CC_E(CC_C(_, _), CC_D(_, _), CC_D(_, _))) => 3 
  case CC_E(_, false, CC_E(CC_C(_, _), CC_D(_, _), CC_D(_, _))) => 4 
  case CC_E(_, true, CC_E(CC_C(_, _), CC_D(_, _), CC_E(_, _, _))) => 5 
  case CC_E(_, false, CC_E(CC_C(_, _), CC_D(_, _), CC_E(_, _, _))) => 6 
  case CC_E(_, true, CC_E(CC_C(_, _), CC_D(_, _), CC_F(_, _))) => 7 
  case CC_E(_, false, CC_E(CC_C(_, _), CC_D(_, _), CC_F(_, _))) => 8 
  case CC_E(_, true, CC_F(CC_D(_, _), (_,_))) => 9 
  case CC_E(_, false, CC_F(CC_D(_, _), (_,_))) => 10 
  case CC_F(true, (_,CC_C(_, _))) => 11 
  case CC_F(false, (_,CC_C(_, _))) => 12 
}
}