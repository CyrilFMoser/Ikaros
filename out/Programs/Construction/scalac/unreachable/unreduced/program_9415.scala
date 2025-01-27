package Program_17 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C]() extends T_A
case class CC_B(a: T_A, b: Byte, c: (T_A,(T_A,T_A))) extends T_A
case class CC_C(a: T_A, b: T_B[Boolean, (Char,T_A)]) extends T_A
case class CC_D[D, E](a: D, b: E) extends T_B[D, T_B[T_A, CC_B]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, (CC_A(),(_,_))) => 1 
  case CC_B(CC_A(), _, (CC_B(_, _, _),(_,_))) => 2 
  case CC_B(CC_A(), _, (CC_C(_, _),(_,_))) => 3 
  case CC_B(CC_B(_, 0, _), _, (CC_A(),(_,_))) => 4 
  case CC_B(CC_B(_, 0, _), _, (CC_B(_, _, _),(_,_))) => 5 
  case CC_B(CC_B(_, 0, _), _, (CC_C(_, _),(_,_))) => 6 
  case CC_B(CC_B(_, _, _), _, (CC_A(),(_,_))) => 7 
  case CC_B(CC_B(_, _, _), _, (CC_B(_, _, _),(_,_))) => 8 
  case CC_B(CC_B(_, _, _), _, (CC_C(_, _),(_,_))) => 9 
  case CC_B(CC_C(CC_A(), _), _, (CC_A(),(_,_))) => 10 
  case CC_B(CC_C(CC_A(), _), _, (CC_B(_, _, _),(_,_))) => 11 
  case CC_B(CC_C(CC_A(), _), _, (CC_C(_, _),(_,_))) => 12 
  case CC_B(CC_C(CC_B(_, _, _), _), _, (CC_A(),(_,_))) => 13 
  case CC_B(CC_C(CC_B(_, _, _), _), _, (CC_B(_, _, _),(_,_))) => 14 
  case CC_B(CC_C(CC_B(_, _, _), _), _, (CC_C(_, _),(_,_))) => 15 
  case CC_B(CC_C(CC_C(_, _), _), _, (CC_A(),(_,_))) => 16 
  case CC_B(CC_C(CC_C(_, _), _), _, (CC_B(_, _, _),(_,_))) => 17 
  case CC_B(CC_C(CC_C(_, _), _), _, (CC_C(_, _),(_,_))) => 18 
  case CC_C(_, _) => 19 
}
}