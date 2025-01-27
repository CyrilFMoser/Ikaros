package Program_16 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_A,Char), b: T_A, c: (T_B[T_A],T_B[T_A])) extends T_A
case class CC_B[B](a: T_B[B]) extends T_A
case class CC_C(a: CC_B[T_A], b: Char) extends T_A
case class CC_D[C]() extends T_B[C]
case class CC_E[D]() extends T_B[D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _, _),_), CC_A((_,_), _, (_,_)), (CC_D(),CC_D())) => 0 
  case CC_A((CC_B(_),_), CC_A((_,_), _, (_,_)), (CC_D(),CC_D())) => 1 
  case CC_A((CC_C(_, _),_), CC_A((_,_), _, (_,_)), (CC_D(),CC_D())) => 2 
  case CC_A((CC_A(_, _, _),_), CC_B(_), (CC_D(),CC_D())) => 3 
  case CC_A((CC_B(_),_), CC_B(_), (CC_D(),CC_D())) => 4 
  case CC_A((CC_C(_, _),_), CC_B(_), (CC_D(),CC_D())) => 5 
  case CC_A((CC_A(_, _, _),_), CC_C(CC_B(_), _), (CC_D(),CC_D())) => 6 
  case CC_A((CC_B(_),_), CC_C(CC_B(_), _), (CC_D(),CC_D())) => 7 
  case CC_A((CC_C(_, _),_), CC_C(CC_B(_), _), (CC_D(),CC_D())) => 8 
  case CC_A((CC_A(_, _, _),_), CC_A((_,_), _, (_,_)), (CC_D(),CC_E())) => 9 
  case CC_A((CC_B(_),_), CC_A((_,_), _, (_,_)), (CC_D(),CC_E())) => 10 
  case CC_A((CC_C(_, _),_), CC_A((_,_), _, (_,_)), (CC_D(),CC_E())) => 11 
  case CC_A((CC_A(_, _, _),_), CC_B(_), (CC_D(),CC_E())) => 12 
  case CC_A((CC_B(_),_), CC_B(_), (CC_D(),CC_E())) => 13 
  case CC_A((CC_C(_, _),_), CC_B(_), (CC_D(),CC_E())) => 14 
  case CC_A((CC_A(_, _, _),_), CC_C(CC_B(_), _), (CC_D(),CC_E())) => 15 
  case CC_A((CC_B(_),_), CC_C(CC_B(_), _), (CC_D(),CC_E())) => 16 
  case CC_A((CC_C(_, _),_), CC_C(CC_B(_), _), (CC_D(),CC_E())) => 17 
  case CC_A((CC_A(_, _, _),_), CC_A((_,_), _, (_,_)), (CC_E(),CC_D())) => 18 
  case CC_A((CC_B(_),_), CC_A((_,_), _, (_,_)), (CC_E(),CC_D())) => 19 
  case CC_A((CC_C(_, _),_), CC_A((_,_), _, (_,_)), (CC_E(),CC_D())) => 20 
  case CC_A((CC_A(_, _, _),_), CC_B(_), (CC_E(),CC_D())) => 21 
  case CC_A((CC_B(_),_), CC_B(_), (CC_E(),CC_D())) => 22 
  case CC_A((CC_C(_, _),_), CC_B(_), (CC_E(),CC_D())) => 23 
  case CC_A((CC_A(_, _, _),_), CC_C(CC_B(_), _), (CC_E(),CC_D())) => 24 
  case CC_A((CC_B(_),_), CC_C(CC_B(_), _), (CC_E(),CC_D())) => 25 
  case CC_A((CC_C(_, _),_), CC_C(CC_B(_), _), (CC_E(),CC_D())) => 26 
  case CC_A((CC_A(_, _, _),_), CC_A((_,_), _, (_,_)), (CC_E(),CC_E())) => 27 
  case CC_A((CC_B(_),_), CC_A((_,_), _, (_,_)), (CC_E(),CC_E())) => 28 
  case CC_A((CC_C(_, _),_), CC_A((_,_), _, (_,_)), (CC_E(),CC_E())) => 29 
  case CC_A((CC_A(_, _, _),_), CC_B(_), (CC_E(),CC_E())) => 30 
  case CC_A((CC_B(_),_), CC_B(_), (CC_E(),CC_E())) => 31 
  case CC_A((CC_C(_, _),_), CC_B(_), (CC_E(),CC_E())) => 32 
  case CC_A((CC_B(_),_), CC_C(CC_B(_), _), (CC_E(),CC_E())) => 33 
  case CC_A((CC_C(_, _),_), CC_C(CC_B(_), _), (CC_E(),CC_E())) => 34 
  case CC_B(_) => 35 
  case CC_C(CC_B(_), _) => 36 
}
}
// This is not matched: CC_A((CC_A(_, _, _),_), CC_C(CC_B(_), _), (CC_E(),CC_E()))