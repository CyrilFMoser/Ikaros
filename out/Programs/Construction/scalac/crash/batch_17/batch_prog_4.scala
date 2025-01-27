package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: (T_B[T_A],T_A), c: T_A) extends T_A
case class CC_B(a: T_A, b: T_B[T_A]) extends T_A
case class CC_C[B](a: T_B[CC_B], b: B, c: T_A) extends T_A
case class CC_D[C](a: T_A, b: Byte, c: Boolean) extends T_B[C]
case class CC_E[D](a: CC_A) extends T_B[D]
case class CC_F[E](a: T_B[E], b: E, c: CC_A) extends T_B[E]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _, CC_A(_, _, _)), _, _) => 0 
  case CC_D(CC_A(_, _, CC_B(_, _)), _, _) => 1 
  case CC_D(CC_A(_, _, CC_C(_, _, _)), _, _) => 2 
  case CC_D(CC_B(_, CC_D(_, _, _)), _, _) => 3 
  case CC_D(CC_B(_, CC_E(_)), _, _) => 4 
  case CC_D(CC_C(_, _, _), _, _) => 5 
  case CC_E(CC_A(CC_D(_, _, _), (_,_), CC_A(_, _, _))) => 6 
  case CC_E(CC_A(CC_D(_, _, _), (_,_), CC_B(_, _))) => 7 
  case CC_E(CC_A(CC_D(_, _, _), (_,_), CC_C(_, _, _))) => 8 
  case CC_E(CC_A(CC_E(_), (_,_), CC_A(_, _, _))) => 9 
  case CC_E(CC_A(CC_E(_), (_,_), CC_B(_, _))) => 10 
  case CC_E(CC_A(CC_E(_), (_,_), CC_C(_, _, _))) => 11 
  case CC_E(CC_A(CC_F(_, _, _), (_,_), CC_A(_, _, _))) => 12 
  case CC_E(CC_A(CC_F(_, _, _), (_,_), CC_B(_, _))) => 13 
  case CC_E(CC_A(CC_F(_, _, _), (_,_), CC_C(_, _, _))) => 14 
  case CC_F(_, _, CC_A(_, _, CC_A(_, _, _))) => 15 
  case CC_F(_, _, CC_A(_, _, CC_B(_, _))) => 16 
  case CC_F(_, _, CC_A(_, _, CC_C(_, _, _))) => 17 
}
}
// This is not matched: CC_D(CC_B(_, CC_F(_, _, _)), _, _)