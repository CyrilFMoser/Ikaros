package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_A[C, C], c: C) extends T_A[C, T_A[T_A[T_B, T_B], T_B]]
case class CC_B(a: T_B, b: (T_B,T_B), c: T_B) extends T_B
case class CC_C(a: T_B, b: CC_A[CC_B]) extends T_B
case class CC_D() extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _, _), _, CC_B(_, (_,_), _)) => 0 
  case CC_B(CC_C(CC_B(_, _, _), CC_A(_, _, _)), _, CC_B(_, (_,_), _)) => 1 
  case CC_B(CC_C(CC_C(_, _), CC_A(_, _, _)), _, CC_B(_, (_,_), _)) => 2 
  case CC_B(CC_C(CC_D(), CC_A(_, _, _)), _, CC_B(_, (_,_), _)) => 3 
  case CC_B(CC_D(), _, CC_B(_, (_,_), _)) => 4 
  case CC_B(CC_B(_, _, _), _, CC_C(CC_B(_, _, _), CC_A(_, _, _))) => 5 
  case CC_B(CC_C(CC_B(_, _, _), CC_A(_, _, _)), _, CC_C(CC_B(_, _, _), CC_A(_, _, _))) => 6 
  case CC_B(CC_C(CC_C(_, _), CC_A(_, _, _)), _, CC_C(CC_B(_, _, _), CC_A(_, _, _))) => 7 
  case CC_B(CC_C(CC_D(), CC_A(_, _, _)), _, CC_C(CC_B(_, _, _), CC_A(_, _, _))) => 8 
  case CC_B(CC_D(), _, CC_C(CC_B(_, _, _), CC_A(_, _, _))) => 9 
  case CC_B(CC_B(_, _, _), _, CC_C(CC_C(_, _), CC_A(_, _, _))) => 10 
  case CC_B(CC_C(CC_B(_, _, _), CC_A(_, _, _)), _, CC_C(CC_C(_, _), CC_A(_, _, _))) => 11 
  case CC_B(CC_C(CC_C(_, _), CC_A(_, _, _)), _, CC_C(CC_C(_, _), CC_A(_, _, _))) => 12 
  case CC_B(CC_C(CC_D(), CC_A(_, _, _)), _, CC_C(CC_C(_, _), CC_A(_, _, _))) => 13 
  case CC_B(CC_D(), _, CC_C(CC_C(_, _), CC_A(_, _, _))) => 14 
  case CC_B(CC_B(_, _, _), _, CC_C(CC_D(), CC_A(_, _, _))) => 15 
  case CC_B(CC_C(CC_B(_, _, _), CC_A(_, _, _)), _, CC_C(CC_D(), CC_A(_, _, _))) => 16 
  case CC_B(CC_C(CC_C(_, _), CC_A(_, _, _)), _, CC_C(CC_D(), CC_A(_, _, _))) => 17 
  case CC_B(CC_C(CC_D(), CC_A(_, _, _)), _, CC_C(CC_D(), CC_A(_, _, _))) => 18 
  case CC_B(CC_D(), _, CC_C(CC_D(), CC_A(_, _, _))) => 19 
  case CC_B(CC_B(_, _, _), _, CC_D()) => 20 
  case CC_B(CC_C(CC_B(_, _, _), CC_A(_, _, _)), _, CC_D()) => 21 
  case CC_B(CC_C(CC_C(_, _), CC_A(_, _, _)), _, CC_D()) => 22 
  case CC_B(CC_C(CC_D(), CC_A(_, _, _)), _, CC_D()) => 23 
  case CC_B(CC_D(), _, CC_D()) => 24 
}
}