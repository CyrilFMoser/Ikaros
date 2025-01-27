package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: Boolean, b: T_A[T_A[Int, Byte], T_A[Byte, Char]], c: T_B[T_B[Char, Boolean], (Int,Byte)]) extends T_A[T_B[T_A[Byte, Int], T_A[Int, Boolean]], Int]
case class CC_B(a: (T_B[CC_A, CC_A],Byte), b: T_B[T_A[CC_A, (Char,Int)], CC_A], c: T_B[CC_A, Byte]) extends T_A[T_B[T_A[Byte, Int], T_A[Int, Boolean]], Int]
case class CC_C[E, F](a: (CC_A,T_B[CC_B, Int]), b: T_A[E, F], c: Char) extends T_B[E, F]
case class CC_D[G, H](a: G) extends T_B[H, G]
case class CC_E[I, J](a: T_B[J, I], b: J, c: J) extends T_B[J, I]

val v_a: T_A[T_B[T_A[Byte, Int], T_A[Int, Boolean]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_C(_, _, _)) => 0 
  case CC_A(_, _, CC_D(_)) => 1 
  case CC_A(_, _, CC_E(_, _, _)) => 2 
  case CC_B((_,_), CC_C(_, _, _), CC_C(_, _, _)) => 3 
  case CC_B((_,_), CC_C(_, _, _), CC_D(_)) => 4 
  case CC_B((_,_), CC_C(_, _, _), CC_E(_, _, _)) => 5 
  case CC_B((_,_), CC_D(_), CC_C(_, _, _)) => 6 
  case CC_B((_,_), CC_D(_), CC_D(_)) => 7 
  case CC_B((_,_), CC_D(_), CC_E(_, _, _)) => 8 
  case CC_B((_,_), CC_E(_, _, _), CC_C(_, _, _)) => 9 
  case CC_B((_,_), CC_E(_, _, _), CC_D(_)) => 10 
  case CC_B((_,_), CC_E(_, _, _), CC_E(_, _, _)) => 11 
}
}