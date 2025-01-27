package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[Int, E]
case class CC_B[F](a: T_A[Int, F]) extends T_A[Int, F]
case class CC_C[G](a: CC_B[G], b: (Char,T_A[Char, Int]), c: T_A[G, G]) extends T_A[Int, G]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(CC_B(CC_A()), (_,_), CC_A()) => 2 
  case CC_C(CC_B(CC_A()), (_,_), CC_B(_)) => 3 
  case CC_C(CC_B(CC_A()), (_,_), CC_C(CC_B(_), _, CC_A())) => 4 
  case CC_C(CC_B(CC_A()), (_,_), CC_C(CC_B(_), _, CC_B(_))) => 5 
  case CC_C(CC_B(CC_A()), (_,_), CC_C(CC_B(_), _, CC_C(_, _, _))) => 6 
  case CC_C(CC_B(CC_B(_)), (_,_), CC_A()) => 7 
  case CC_C(CC_B(CC_B(_)), (_,_), CC_B(_)) => 8 
  case CC_C(CC_B(CC_B(_)), (_,_), CC_C(CC_B(_), _, CC_A())) => 9 
  case CC_C(CC_B(CC_B(_)), (_,_), CC_C(CC_B(_), _, CC_B(_))) => 10 
  case CC_C(CC_B(CC_B(_)), (_,_), CC_C(CC_B(_), _, CC_C(_, _, _))) => 11 
  case CC_C(CC_B(CC_C(_, _, _)), (_,_), CC_A()) => 12 
  case CC_C(CC_B(CC_C(_, _, _)), (_,_), CC_B(_)) => 13 
  case CC_C(CC_B(CC_C(_, _, _)), (_,_), CC_C(CC_B(_), _, CC_A())) => 14 
  case CC_C(CC_B(CC_C(_, _, _)), (_,_), CC_C(CC_B(_), _, CC_C(_, _, _))) => 15 
}
}
// This is not matched: CC_C(CC_B(CC_C(_, _, _)), (_,_), CC_C(CC_B(_), _, CC_B(_)))