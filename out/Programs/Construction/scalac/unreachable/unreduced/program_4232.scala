package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[(Char,Byte), Char]) extends T_A[D]
case class CC_B[E, F](a: T_A[E], b: (Int,T_A[Byte]), c: F) extends T_A[E]
case class CC_C[G](a: T_A[G]) extends T_A[G]
case class CC_D[H](a: T_A[H], b: H) extends T_B[CC_B[(Boolean,Boolean), T_A[Int]], H]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), (_,CC_A(_)), _) => 1 
  case CC_B(CC_A(_), (_,CC_B(_, _, _)), _) => 2 
  case CC_B(CC_A(_), (_,CC_C(_)), _) => 3 
  case CC_B(CC_B(CC_A(_), (_,_), _), (_,CC_A(_)), _) => 4 
  case CC_B(CC_B(CC_A(_), (_,_), _), (_,CC_B(_, _, _)), _) => 5 
  case CC_B(CC_B(CC_A(_), (_,_), _), (_,CC_C(_)), _) => 6 
  case CC_B(CC_B(CC_B(_, _, _), (_,_), _), (_,CC_A(_)), _) => 7 
  case CC_B(CC_B(CC_B(_, _, _), (_,_), _), (_,CC_B(_, _, _)), _) => 8 
  case CC_B(CC_B(CC_B(_, _, _), (_,_), _), (_,CC_C(_)), _) => 9 
  case CC_B(CC_B(CC_C(_), (_,_), _), (_,CC_A(_)), _) => 10 
  case CC_B(CC_B(CC_C(_), (_,_), _), (_,CC_B(_, _, _)), _) => 11 
  case CC_B(CC_B(CC_C(_), (_,_), _), (_,CC_C(_)), _) => 12 
  case CC_B(CC_C(CC_A(_)), (_,CC_A(_)), _) => 13 
  case CC_B(CC_C(CC_A(_)), (_,CC_B(_, _, _)), _) => 14 
  case CC_B(CC_C(CC_A(_)), (_,CC_C(_)), _) => 15 
  case CC_B(CC_C(CC_B(_, _, _)), (_,CC_A(_)), _) => 16 
  case CC_B(CC_C(CC_B(_, _, _)), (_,CC_B(_, _, _)), _) => 17 
  case CC_B(CC_C(CC_B(_, _, _)), (_,CC_C(_)), _) => 18 
  case CC_B(CC_C(CC_C(_)), (_,CC_A(_)), _) => 19 
  case CC_B(CC_C(CC_C(_)), (_,CC_B(_, _, _)), _) => 20 
  case CC_B(CC_C(CC_C(_)), (_,CC_C(_)), _) => 21 
  case CC_C(CC_A(_)) => 22 
  case CC_C(CC_B(CC_A(_), _, _)) => 23 
  case CC_C(CC_B(CC_B(_, _, _), _, _)) => 24 
  case CC_C(CC_B(CC_C(_), _, _)) => 25 
  case CC_C(CC_C(CC_A(_))) => 26 
  case CC_C(CC_C(CC_B(_, _, _))) => 27 
  case CC_C(CC_C(CC_C(_))) => 28 
}
}