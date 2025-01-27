package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: (T_A[Int],T_A[Char])) extends T_A[C]
case class CC_B[D](a: T_A[D], b: D, c: T_A[D]) extends T_A[D]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _), _, CC_A(CC_A(_, _), (_,_))) => 1 
  case CC_B(CC_A(_, _), _, CC_A(CC_B(_, _, _), (_,_))) => 2 
  case CC_B(CC_A(_, _), _, CC_B(_, _, _)) => 3 
  case CC_B(CC_B(CC_A(_, _), _, CC_A(_, _)), _, CC_A(CC_A(_, _), (_,_))) => 4 
  case CC_B(CC_B(CC_A(_, _), _, CC_A(_, _)), _, CC_A(CC_B(_, _, _), (_,_))) => 5 
  case CC_B(CC_B(CC_A(_, _), _, CC_A(_, _)), _, CC_B(_, _, _)) => 6 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_A(_, _)), _, CC_A(CC_A(_, _), (_,_))) => 7 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_A(_, _)), _, CC_A(CC_B(_, _, _), (_,_))) => 8 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_A(_, _)), _, CC_B(_, _, _)) => 9 
  case CC_B(CC_B(CC_A(_, _), _, CC_B(_, _, _)), _, CC_A(CC_A(_, _), (_,_))) => 10 
  case CC_B(CC_B(CC_A(_, _), _, CC_B(_, _, _)), _, CC_B(_, _, _)) => 11 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_B(_, _, _)), _, CC_A(CC_A(_, _), (_,_))) => 12 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_B(_, _, _)), _, CC_A(CC_B(_, _, _), (_,_))) => 13 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_B(_, _, _)), _, CC_B(_, _, _)) => 14 
}
}
// This is not matched: CC_B(CC_B(CC_A(_, _), _, CC_B(_, _, _)), _, CC_A(CC_B(_, _, _), (_,_)))