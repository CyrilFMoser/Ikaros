package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: (T_A[Byte, Boolean],(Char,Int))) extends T_A[T_A[C, C], C]
case class CC_B[D](a: CC_A[D], b: T_A[D, D], c: T_A[D, D]) extends T_A[T_A[D, D], D]
case class CC_C[E](a: T_A[T_A[CC_B[(Byte,Int)], CC_B[(Byte,Int)]], CC_B[(Byte,Int)]], b: E) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), (_,(_,_))) => 0 
  case CC_A(CC_B(_, _, _), (_,(_,_))) => 1 
  case CC_A(CC_C(CC_A(_, _), _), (_,(_,_))) => 2 
  case CC_A(CC_C(CC_B(_, _, _), _), (_,(_,_))) => 3 
  case CC_A(CC_C(CC_C(_, _), _), (_,(_,_))) => 4 
  case CC_B(CC_A(CC_A(_, _), (_,_)), _, _) => 5 
  case CC_B(CC_A(CC_B(_, _, _), (_,_)), _, _) => 6 
  case CC_B(CC_A(CC_C(_, _), (_,_)), _, _) => 7 
  case CC_C(CC_A(CC_A(_, _), _), _) => 8 
  case CC_C(CC_A(CC_B(_, _, _), _), _) => 9 
  case CC_C(CC_A(CC_C(_, _), _), _) => 10 
  case CC_C(CC_B(CC_A(_, _), _, _), _) => 11 
  case CC_C(CC_C(_, CC_B(_, _, _)), _) => 12 
}
}