package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: (T_A[(Byte,Byte), Byte],(Byte,Byte)), b: (T_A[Char, Char],T_A[Boolean, Int]), c: T_B[F, E]) extends T_A[E, F]
case class CC_B[H, G](a: G, b: T_A[G, H]) extends T_A[H, G]
case class CC_C[J, I](a: T_B[I, J]) extends T_A[J, I]
case class CC_D[K](a: K, b: Int) extends T_B[CC_A[T_A[Int, Byte], Int], K]
case class CC_E[L]() extends T_B[CC_C[L, L], L]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _, _),(_,_)), (CC_A(_, _, _),CC_A(_, _, _)), _) => 0 
  case CC_A((CC_A(_, _, _),(_,_)), (CC_A(_, _, _),CC_B(_, _)), _) => 1 
  case CC_A((CC_A(_, _, _),(_,_)), (CC_A(_, _, _),CC_C(_)), _) => 2 
  case CC_A((CC_A(_, _, _),(_,_)), (CC_B(_, _),CC_A(_, _, _)), _) => 3 
  case CC_A((CC_A(_, _, _),(_,_)), (CC_B(_, _),CC_B(_, _)), _) => 4 
  case CC_A((CC_A(_, _, _),(_,_)), (CC_B(_, _),CC_C(_)), _) => 5 
  case CC_A((CC_A(_, _, _),(_,_)), (CC_C(_),CC_A(_, _, _)), _) => 6 
  case CC_A((CC_A(_, _, _),(_,_)), (CC_C(_),CC_B(_, _)), _) => 7 
  case CC_A((CC_A(_, _, _),(_,_)), (CC_C(_),CC_C(_)), _) => 8 
  case CC_A((CC_B(_, _),(_,_)), (CC_A(_, _, _),CC_A(_, _, _)), _) => 9 
  case CC_A((CC_B(_, _),(_,_)), (CC_A(_, _, _),CC_B(_, _)), _) => 10 
  case CC_A((CC_B(_, _),(_,_)), (CC_A(_, _, _),CC_C(_)), _) => 11 
  case CC_A((CC_B(_, _),(_,_)), (CC_B(_, _),CC_A(_, _, _)), _) => 12 
  case CC_A((CC_B(_, _),(_,_)), (CC_B(_, _),CC_B(_, _)), _) => 13 
  case CC_A((CC_B(_, _),(_,_)), (CC_B(_, _),CC_C(_)), _) => 14 
  case CC_A((CC_B(_, _),(_,_)), (CC_C(_),CC_A(_, _, _)), _) => 15 
  case CC_A((CC_B(_, _),(_,_)), (CC_C(_),CC_B(_, _)), _) => 16 
  case CC_A((CC_B(_, _),(_,_)), (CC_C(_),CC_C(_)), _) => 17 
  case CC_A((CC_C(_),(_,_)), (CC_A(_, _, _),CC_A(_, _, _)), _) => 18 
  case CC_A((CC_C(_),(_,_)), (CC_A(_, _, _),CC_B(_, _)), _) => 19 
  case CC_A((CC_C(_),(_,_)), (CC_A(_, _, _),CC_C(_)), _) => 20 
  case CC_A((CC_C(_),(_,_)), (CC_B(_, _),CC_A(_, _, _)), _) => 21 
  case CC_A((CC_C(_),(_,_)), (CC_B(_, _),CC_B(_, _)), _) => 22 
  case CC_A((CC_C(_),(_,_)), (CC_B(_, _),CC_C(_)), _) => 23 
  case CC_A((CC_C(_),(_,_)), (CC_C(_),CC_A(_, _, _)), _) => 24 
  case CC_A((CC_C(_),(_,_)), (CC_C(_),CC_B(_, _)), _) => 25 
  case CC_A((CC_C(_),(_,_)), (CC_C(_),CC_C(_)), _) => 26 
  case CC_B(_, CC_A(_, _, _)) => 27 
  case CC_B(_, CC_B(_, _)) => 28 
  case CC_B(_, CC_C(_)) => 29 
  case CC_C(_) => 30 
}
}