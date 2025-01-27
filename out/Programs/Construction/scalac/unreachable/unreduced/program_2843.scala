package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[(Int,Char)], b: T_B[T_A[Byte]], c: T_B[T_A[Char]]) extends T_A[T_A[(Int,Char)]]
case class CC_B(a: T_B[CC_A], b: T_A[CC_A], c: Boolean) extends T_A[T_A[(Int,Char)]]
case class CC_C(a: CC_B, b: Byte, c: (T_B[CC_A],T_A[CC_B])) extends T_A[T_A[(Int,Char)]]
case class CC_D[C](a: CC_B) extends T_B[C]
case class CC_E[D](a: T_B[D], b: T_B[D], c: (T_B[CC_C],Char)) extends T_B[D]
case class CC_F[E](a: E, b: CC_D[E]) extends T_B[E]

val v_a: T_A[T_A[(Int,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(_), CC_D(CC_B(_, _, _))) => 0 
  case CC_A(_, CC_D(_), CC_E(_, _, _)) => 1 
  case CC_A(_, CC_D(_), CC_F(_, _)) => 2 
  case CC_A(_, CC_E(CC_D(_), CC_D(_), (_,_)), CC_D(CC_B(_, _, _))) => 3 
  case CC_A(_, CC_E(CC_D(_), CC_D(_), (_,_)), CC_E(_, _, _)) => 4 
  case CC_A(_, CC_E(CC_D(_), CC_D(_), (_,_)), CC_F(_, _)) => 5 
  case CC_A(_, CC_E(CC_D(_), CC_E(_, _, _), (_,_)), CC_D(CC_B(_, _, _))) => 6 
  case CC_A(_, CC_E(CC_D(_), CC_E(_, _, _), (_,_)), CC_E(_, _, _)) => 7 
  case CC_A(_, CC_E(CC_D(_), CC_E(_, _, _), (_,_)), CC_F(_, _)) => 8 
  case CC_A(_, CC_E(CC_D(_), CC_F(_, _), (_,_)), CC_D(CC_B(_, _, _))) => 9 
  case CC_A(_, CC_E(CC_D(_), CC_F(_, _), (_,_)), CC_E(_, _, _)) => 10 
  case CC_A(_, CC_E(CC_D(_), CC_F(_, _), (_,_)), CC_F(_, _)) => 11 
  case CC_A(_, CC_E(CC_E(_, _, _), CC_D(_), (_,_)), CC_D(CC_B(_, _, _))) => 12 
  case CC_A(_, CC_E(CC_E(_, _, _), CC_D(_), (_,_)), CC_E(_, _, _)) => 13 
  case CC_A(_, CC_E(CC_E(_, _, _), CC_D(_), (_,_)), CC_F(_, _)) => 14 
  case CC_A(_, CC_E(CC_E(_, _, _), CC_E(_, _, _), (_,_)), CC_D(CC_B(_, _, _))) => 15 
  case CC_A(_, CC_E(CC_E(_, _, _), CC_E(_, _, _), (_,_)), CC_E(_, _, _)) => 16 
  case CC_A(_, CC_E(CC_E(_, _, _), CC_E(_, _, _), (_,_)), CC_F(_, _)) => 17 
  case CC_A(_, CC_E(CC_E(_, _, _), CC_F(_, _), (_,_)), CC_D(CC_B(_, _, _))) => 18 
  case CC_A(_, CC_E(CC_E(_, _, _), CC_F(_, _), (_,_)), CC_E(_, _, _)) => 19 
  case CC_A(_, CC_E(CC_E(_, _, _), CC_F(_, _), (_,_)), CC_F(_, _)) => 20 
  case CC_A(_, CC_E(CC_F(_, _), CC_D(_), (_,_)), CC_D(CC_B(_, _, _))) => 21 
  case CC_A(_, CC_E(CC_F(_, _), CC_D(_), (_,_)), CC_E(_, _, _)) => 22 
  case CC_A(_, CC_E(CC_F(_, _), CC_D(_), (_,_)), CC_F(_, _)) => 23 
  case CC_A(_, CC_E(CC_F(_, _), CC_E(_, _, _), (_,_)), CC_D(CC_B(_, _, _))) => 24 
  case CC_A(_, CC_E(CC_F(_, _), CC_E(_, _, _), (_,_)), CC_E(_, _, _)) => 25 
  case CC_A(_, CC_E(CC_F(_, _), CC_E(_, _, _), (_,_)), CC_F(_, _)) => 26 
  case CC_A(_, CC_E(CC_F(_, _), CC_F(_, _), (_,_)), CC_D(CC_B(_, _, _))) => 27 
  case CC_A(_, CC_E(CC_F(_, _), CC_F(_, _), (_,_)), CC_E(_, _, _)) => 28 
  case CC_A(_, CC_E(CC_F(_, _), CC_F(_, _), (_,_)), CC_F(_, _)) => 29 
  case CC_A(_, CC_F(_, CC_D(_)), CC_D(CC_B(_, _, _))) => 30 
  case CC_A(_, CC_F(_, CC_D(_)), CC_E(_, _, _)) => 31 
  case CC_A(_, CC_F(_, CC_D(_)), CC_F(_, _)) => 32 
  case CC_B(CC_D(CC_B(_, _, _)), _, _) => 33 
  case CC_B(CC_E(_, _, _), _, _) => 34 
  case CC_B(CC_F(_, _), _, _) => 35 
  case CC_C(_, _, _) => 36 
}
}