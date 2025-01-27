package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_B[T_A, T_A], (T_A,T_A)], c: T_A) extends T_A
case class CC_B(a: Int, b: Int, c: T_B[Int, CC_A]) extends T_A
case class CC_C(a: CC_A, b: (T_B[CC_A, CC_A],T_B[CC_A, T_A])) extends T_A
case class CC_D[C](a: C, b: C, c: CC_C) extends T_B[C, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, CC_A(_, _, _)), _, CC_A(_, _, _)) => 0 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_A(_, _, _)), _, CC_B(_, _, _)) => 1 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_A(_, _, _)), _, CC_C(_, (_,_))) => 2 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_B(_, _, _)), _, CC_A(_, _, _)) => 3 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_B(_, _, _)), _, CC_B(_, _, _)) => 4 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_B(_, _, _)), _, CC_C(_, (_,_))) => 5 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_C(_, _)), _, CC_A(_, _, _)) => 6 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_C(_, _)), _, CC_B(_, _, _)) => 7 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_C(_, _)), _, CC_C(_, (_,_))) => 8 
  case CC_A(CC_A(CC_B(_, _, _), _, CC_A(_, _, _)), _, CC_A(_, _, _)) => 9 
  case CC_A(CC_A(CC_B(_, _, _), _, CC_A(_, _, _)), _, CC_B(_, _, _)) => 10 
  case CC_A(CC_A(CC_B(_, _, _), _, CC_A(_, _, _)), _, CC_C(_, (_,_))) => 11 
  case CC_A(CC_A(CC_B(_, _, _), _, CC_B(_, _, _)), _, CC_A(_, _, _)) => 12 
  case CC_A(CC_A(CC_B(_, _, _), _, CC_B(_, _, _)), _, CC_B(_, _, _)) => 13 
  case CC_A(CC_A(CC_B(_, _, _), _, CC_B(_, _, _)), _, CC_C(_, (_,_))) => 14 
  case CC_A(CC_A(CC_B(_, _, _), _, CC_C(_, _)), _, CC_A(_, _, _)) => 15 
  case CC_A(CC_A(CC_B(_, _, _), _, CC_C(_, _)), _, CC_B(_, _, _)) => 16 
  case CC_A(CC_A(CC_B(_, _, _), _, CC_C(_, _)), _, CC_C(_, (_,_))) => 17 
  case CC_A(CC_A(CC_C(_, _), _, CC_A(_, _, _)), _, CC_A(_, _, _)) => 18 
  case CC_A(CC_A(CC_C(_, _), _, CC_A(_, _, _)), _, CC_B(_, _, _)) => 19 
  case CC_A(CC_A(CC_C(_, _), _, CC_A(_, _, _)), _, CC_C(_, (_,_))) => 20 
  case CC_A(CC_A(CC_C(_, _), _, CC_B(_, _, _)), _, CC_A(_, _, _)) => 21 
  case CC_A(CC_A(CC_C(_, _), _, CC_B(_, _, _)), _, CC_B(_, _, _)) => 22 
  case CC_A(CC_A(CC_C(_, _), _, CC_B(_, _, _)), _, CC_C(_, (_,_))) => 23 
  case CC_A(CC_A(CC_C(_, _), _, CC_C(_, _)), _, CC_A(_, _, _)) => 24 
  case CC_A(CC_A(CC_C(_, _), _, CC_C(_, _)), _, CC_B(_, _, _)) => 25 
  case CC_A(CC_A(CC_C(_, _), _, CC_C(_, _)), _, CC_C(_, (_,_))) => 26 
  case CC_A(CC_B(_, _, _), _, CC_A(_, _, _)) => 27 
  case CC_A(CC_B(_, _, _), _, CC_B(_, _, _)) => 28 
  case CC_A(CC_B(_, _, _), _, CC_C(_, (_,_))) => 29 
  case CC_A(CC_C(_, (_,_)), _, CC_A(_, _, _)) => 30 
  case CC_A(CC_C(_, (_,_)), _, CC_B(_, _, _)) => 31 
  case CC_A(CC_C(_, (_,_)), _, CC_C(_, (_,_))) => 32 
  case CC_B(_, _, _) => 33 
  case CC_C(CC_A(_, _, _), (CC_D(_, _, _),_)) => 34 
}
}