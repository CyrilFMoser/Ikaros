package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[Boolean, E]
case class CC_B[G, H](a: T_B[T_B[G, G], G], b: G, c: (T_A[Byte, Char],Byte)) extends T_B[H, G]
case class CC_C[I, J](a: T_A[Boolean, I], b: J, c: T_B[I, I]) extends T_B[I, J]

val v_a: T_B[Int, Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _, _), 12, (_,_)), _, (_,0)) => 0 
  case CC_B(CC_B(CC_C(_, _, _), 12, (_,_)), _, (_,0)) => 1 
  case CC_B(CC_B(CC_B(_, _, _), _, (_,_)), _, (_,0)) => 2 
  case CC_B(CC_B(CC_C(_, _, _), _, (_,_)), _, (_,0)) => 3 
  case CC_B(CC_C(_, _, _), _, (_,0)) => 4 
  case CC_B(CC_B(CC_B(_, _, _), 12, (_,_)), _, (_,_)) => 5 
  case CC_B(CC_B(CC_C(_, _, _), 12, (_,_)), _, (_,_)) => 6 
  case CC_B(CC_B(CC_B(_, _, _), _, (_,_)), _, (_,_)) => 7 
  case CC_B(CC_B(CC_C(_, _, _), _, (_,_)), _, (_,_)) => 8 
  case CC_B(CC_C(_, _, _), _, (_,_)) => 9 
  case CC_C(_, _, CC_B(_, _, _)) => 10 
  case CC_C(_, _, CC_C(CC_A(), _, CC_B(_, _, _))) => 11 
  case CC_C(_, _, CC_C(CC_A(), _, CC_C(_, _, _))) => 12 
}
}