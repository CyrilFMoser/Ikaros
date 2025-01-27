package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, T_A[C, C]], b: C, c: T_A[((Boolean,Byte),Int), T_A[((Boolean,Byte),Int), ((Boolean,Byte),Int)]]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, D], b: (CC_A[(Boolean,Boolean)],CC_A[Char]), c: T_A[D, Int]) extends T_A[D, T_A[D, D]]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), 'x', CC_A(_, _, _)), _, CC_A(_, _, _)) => 0 
  case CC_A(CC_A(CC_A(_, _, _), 'x', CC_A(_, _, _)), _, CC_B(_, _, _)) => 1 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_A(_, _, _)), _, CC_A(_, _, _)) => 2 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_A(_, _, _)), _, CC_B(_, _, _)) => 3 
  case CC_A(CC_A(CC_B(_, _, _), 'x', CC_A(_, _, _)), _, CC_A(_, _, _)) => 4 
  case CC_A(CC_A(CC_B(_, _, _), 'x', CC_A(_, _, _)), _, CC_B(_, _, _)) => 5 
  case CC_A(CC_A(CC_B(_, _, _), _, CC_A(_, _, _)), _, CC_A(_, _, _)) => 6 
  case CC_A(CC_A(CC_B(_, _, _), _, CC_A(_, _, _)), _, CC_B(_, _, _)) => 7 
  case CC_A(CC_A(CC_A(_, _, _), 'x', CC_B(_, _, _)), _, CC_A(_, _, _)) => 8 
  case CC_A(CC_A(CC_A(_, _, _), 'x', CC_B(_, _, _)), _, CC_B(_, _, _)) => 9 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_B(_, _, _)), _, CC_A(_, _, _)) => 10 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_B(_, _, _)), _, CC_B(_, _, _)) => 11 
  case CC_A(CC_A(CC_B(_, _, _), 'x', CC_B(_, _, _)), _, CC_A(_, _, _)) => 12 
  case CC_A(CC_A(CC_B(_, _, _), 'x', CC_B(_, _, _)), _, CC_B(_, _, _)) => 13 
  case CC_A(CC_A(CC_B(_, _, _), _, CC_B(_, _, _)), _, CC_A(_, _, _)) => 14 
  case CC_A(CC_A(CC_B(_, _, _), _, CC_B(_, _, _)), _, CC_B(_, _, _)) => 15 
  case CC_A(CC_B(_, (_,_), _), _, CC_A(_, _, _)) => 16 
  case CC_A(CC_B(_, (_,_), _), _, CC_B(_, _, _)) => 17 
}
}