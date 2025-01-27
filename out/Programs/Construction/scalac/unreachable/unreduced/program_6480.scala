package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: (T_A[Boolean, Int],T_A[Char, Boolean]), b: T_B[E, E], c: ((Int,(Int,Int)),T_A[Char, Byte])) extends T_A[E, F]
case class CC_B[H, G](a: T_A[G, G], b: G) extends T_A[H, G]
case class CC_C[I, J](a: J, b: T_A[J, I], c: J) extends T_A[I, J]
case class CC_D[K]() extends T_B[K, Boolean]
case class CC_E(a: (CC_A[Int, Boolean],Byte), b: (T_A[Byte, Int],CC_A[Int, (Byte,Byte)])) extends T_B[T_A[T_A[Byte, Boolean], T_A[Boolean, (Boolean,Int)]], Boolean]
case class CC_F[L](a: L, b: CC_A[L, L]) extends T_B[L, Boolean]

val v_a: T_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), _, ((_,_),CC_A(_, _, _))) => 0 
  case CC_A((CC_A(_, _, _),CC_B(_, _)), _, ((_,_),CC_A(_, _, _))) => 1 
  case CC_A((CC_A(_, _, _),CC_C(_, _, _)), _, ((_,_),CC_A(_, _, _))) => 2 
  case CC_A((CC_B(_, _),CC_A(_, _, _)), _, ((_,_),CC_A(_, _, _))) => 3 
  case CC_A((CC_B(_, _),CC_B(_, _)), _, ((_,_),CC_A(_, _, _))) => 4 
  case CC_A((CC_B(_, _),CC_C(_, _, _)), _, ((_,_),CC_A(_, _, _))) => 5 
  case CC_A((CC_C(_, _, _),CC_A(_, _, _)), _, ((_,_),CC_A(_, _, _))) => 6 
  case CC_A((CC_C(_, _, _),CC_C(_, _, _)), _, ((_,_),CC_A(_, _, _))) => 7 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), _, ((_,_),CC_B(_, _))) => 8 
  case CC_A((CC_A(_, _, _),CC_B(_, _)), _, ((_,_),CC_B(_, _))) => 9 
  case CC_A((CC_A(_, _, _),CC_C(_, _, _)), _, ((_,_),CC_B(_, _))) => 10 
  case CC_A((CC_B(_, _),CC_A(_, _, _)), _, ((_,_),CC_B(_, _))) => 11 
  case CC_A((CC_B(_, _),CC_B(_, _)), _, ((_,_),CC_B(_, _))) => 12 
  case CC_A((CC_B(_, _),CC_C(_, _, _)), _, ((_,_),CC_B(_, _))) => 13 
  case CC_A((CC_C(_, _, _),CC_A(_, _, _)), _, ((_,_),CC_B(_, _))) => 14 
  case CC_A((CC_C(_, _, _),CC_B(_, _)), _, ((_,_),CC_B(_, _))) => 15 
  case CC_A((CC_C(_, _, _),CC_C(_, _, _)), _, ((_,_),CC_B(_, _))) => 16 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), _, ((_,_),CC_C(_, _, _))) => 17 
  case CC_A((CC_A(_, _, _),CC_B(_, _)), _, ((_,_),CC_C(_, _, _))) => 18 
  case CC_A((CC_A(_, _, _),CC_C(_, _, _)), _, ((_,_),CC_C(_, _, _))) => 19 
  case CC_A((CC_B(_, _),CC_A(_, _, _)), _, ((_,_),CC_C(_, _, _))) => 20 
  case CC_A((CC_B(_, _),CC_B(_, _)), _, ((_,_),CC_C(_, _, _))) => 21 
  case CC_A((CC_B(_, _),CC_C(_, _, _)), _, ((_,_),CC_C(_, _, _))) => 22 
  case CC_A((CC_C(_, _, _),CC_A(_, _, _)), _, ((_,_),CC_C(_, _, _))) => 23 
  case CC_A((CC_C(_, _, _),CC_B(_, _)), _, ((_,_),CC_C(_, _, _))) => 24 
  case CC_A((CC_C(_, _, _),CC_C(_, _, _)), _, ((_,_),CC_C(_, _, _))) => 25 
  case CC_B(CC_A(_, _, _), _) => 26 
  case CC_B(CC_B(_, _), _) => 27 
  case CC_B(CC_C(_, _, _), _) => 28 
  case CC_C(_, _, _) => 29 
}
}
// This is not matched: CC_A((CC_C(_, _, _),CC_B(_, _)), _, ((_,_),CC_A(_, _, _)))