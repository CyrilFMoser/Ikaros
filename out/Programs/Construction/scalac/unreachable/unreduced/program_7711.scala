package Program_19 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: (CC_A,T_A), b: T_A, c: (T_A,T_B[CC_A])) extends T_A
case class CC_C(a: CC_A, b: CC_A) extends T_B[Byte]
case class CC_D() extends T_B[Byte]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_, _, (_,_))) => 1 
  case CC_B((CC_A(_),CC_A(_)), CC_A(_), (CC_A(_),_)) => 2 
  case CC_B((CC_A(_),CC_B(_, _, _)), CC_A(_), (CC_A(_),_)) => 3 
  case CC_B((CC_A(_),CC_A(_)), CC_B((_,_), _, (_,_)), (CC_A(_),_)) => 4 
  case CC_B((CC_A(_),CC_B(_, _, _)), CC_B((_,_), _, (_,_)), (CC_A(_),_)) => 5 
  case CC_B((CC_A(_),CC_A(_)), CC_A(_), (CC_B(_, _, _),_)) => 6 
  case CC_B((CC_A(_),CC_B(_, _, _)), CC_A(_), (CC_B(_, _, _),_)) => 7 
  case CC_B((CC_A(_),CC_A(_)), CC_B((_,_), _, (_,_)), (CC_B(_, _, _),_)) => 8 
  case CC_B((CC_A(_),CC_B(_, _, _)), CC_B((_,_), _, (_,_)), (CC_B(_, _, _),_)) => 9 
}
}