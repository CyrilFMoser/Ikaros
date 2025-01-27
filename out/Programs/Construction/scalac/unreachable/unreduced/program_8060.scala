package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[T_A[Boolean, C], C]) extends T_A[Boolean, C]
case class CC_B[D](a: (Boolean,Char), b: T_A[Boolean, D], c: Int) extends T_A[Boolean, D]
case class CC_C[E](a: Int, b: T_A[E, E], c: T_A[Boolean, E]) extends T_A[Boolean, E]

val v_a: T_A[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(_, _, _), _), _) => 1 
  case CC_A(CC_A(CC_C(_, _, _), _), _) => 2 
  case CC_A(CC_B(_, CC_A(_, _), _), _) => 3 
  case CC_A(CC_B(_, CC_B(_, _, _), _), _) => 4 
  case CC_A(CC_B(_, CC_C(_, _, _), _), _) => 5 
  case CC_A(CC_C(12, _, _), _) => 6 
  case CC_A(CC_C(_, _, _), _) => 7 
  case CC_B((_,_), _, _) => 8 
  case CC_C(_, _, CC_A(_, _)) => 9 
  case CC_C(_, _, CC_B((_,_), CC_A(_, _), 12)) => 10 
  case CC_C(_, _, CC_B((_,_), CC_A(_, _), _)) => 11 
  case CC_C(_, _, CC_B((_,_), CC_B(_, _, _), 12)) => 12 
  case CC_C(_, _, CC_B((_,_), CC_B(_, _, _), _)) => 13 
  case CC_C(_, _, CC_B((_,_), CC_C(_, _, _), 12)) => 14 
  case CC_C(_, _, CC_B((_,_), CC_C(_, _, _), _)) => 15 
  case CC_C(_, _, CC_C(_, _, CC_A(_, _))) => 16 
  case CC_C(_, _, CC_C(_, _, CC_B(_, _, _))) => 17 
  case CC_C(_, _, CC_C(_, _, CC_C(_, _, _))) => 18 
}
}