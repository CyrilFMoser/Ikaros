package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[D]
case class CC_B[E](a: (T_A[Int],T_A[Byte]), b: T_A[E]) extends T_A[E]
case class CC_C[F](a: F, b: (CC_A[Byte],T_A[Char])) extends T_A[F]
case class CC_D[G](a: G, b: T_A[G], c: T_B[G, G]) extends T_B[G, Int]
case class CC_E(a: T_B[(Boolean,Int), Int]) extends T_B[Int, Int]

val v_a: T_A[CC_E] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _))) => 1 
  case CC_A(CC_A(CC_C(_, _))) => 2 
  case CC_A(CC_B(_, _)) => 3 
  case CC_A(CC_C(_, (_,_))) => 4 
  case CC_B((CC_A(_),CC_A(_)), CC_A(_)) => 5 
  case CC_B((CC_A(_),CC_A(_)), CC_B((_,_), _)) => 6 
  case CC_B((CC_A(_),CC_A(_)), CC_C(CC_E(_), (_,_))) => 7 
  case CC_B((CC_A(_),CC_B(_, _)), CC_A(_)) => 8 
  case CC_B((CC_A(_),CC_B(_, _)), CC_B((_,_), _)) => 9 
  case CC_B((CC_A(_),CC_B(_, _)), CC_C(CC_E(_), (_,_))) => 10 
  case CC_B((CC_A(_),CC_C(_, _)), CC_A(_)) => 11 
  case CC_B((CC_A(_),CC_C(_, _)), CC_B((_,_), _)) => 12 
  case CC_B((CC_A(_),CC_C(_, _)), CC_C(CC_E(_), (_,_))) => 13 
  case CC_B((CC_B(_, _),CC_A(_)), CC_A(_)) => 14 
  case CC_B((CC_B(_, _),CC_A(_)), CC_B((_,_), _)) => 15 
  case CC_B((CC_B(_, _),CC_A(_)), CC_C(CC_E(_), (_,_))) => 16 
  case CC_B((CC_B(_, _),CC_B(_, _)), CC_A(_)) => 17 
  case CC_B((CC_B(_, _),CC_B(_, _)), CC_B((_,_), _)) => 18 
  case CC_B((CC_B(_, _),CC_B(_, _)), CC_C(CC_E(_), (_,_))) => 19 
  case CC_B((CC_B(_, _),CC_C(_, _)), CC_A(_)) => 20 
  case CC_B((CC_B(_, _),CC_C(_, _)), CC_B((_,_), _)) => 21 
  case CC_B((CC_B(_, _),CC_C(_, _)), CC_C(CC_E(_), (_,_))) => 22 
  case CC_B((CC_C(_, _),CC_A(_)), CC_A(_)) => 23 
  case CC_B((CC_C(_, _),CC_A(_)), CC_B((_,_), _)) => 24 
  case CC_B((CC_C(_, _),CC_A(_)), CC_C(CC_E(_), (_,_))) => 25 
  case CC_B((CC_C(_, _),CC_B(_, _)), CC_A(_)) => 26 
  case CC_B((CC_C(_, _),CC_B(_, _)), CC_B((_,_), _)) => 27 
  case CC_B((CC_C(_, _),CC_B(_, _)), CC_C(CC_E(_), (_,_))) => 28 
  case CC_B((CC_C(_, _),CC_C(_, _)), CC_A(_)) => 29 
  case CC_B((CC_C(_, _),CC_C(_, _)), CC_B((_,_), _)) => 30 
  case CC_B((CC_C(_, _),CC_C(_, _)), CC_C(CC_E(_), (_,_))) => 31 
  case CC_C(CC_E(CC_D(_, _, _)), (CC_A(_),CC_A(_))) => 32 
  case CC_C(CC_E(CC_D(_, _, _)), (CC_A(_),CC_B(_, _))) => 33 
  case CC_C(CC_E(CC_D(_, _, _)), (CC_A(_),CC_C(_, _))) => 34 
}
}