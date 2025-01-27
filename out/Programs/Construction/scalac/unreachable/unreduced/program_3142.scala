package Program_19 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (Char,T_B[T_A, Int]), b: ((T_A,(Byte,Boolean)),(T_A,T_A)), c: T_B[T_A, T_B[T_A, T_A]]) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: T_A, b: Char, c: ((T_A,T_A),Int)) extends T_A
case class CC_D[C]() extends T_B[Char, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, _) => 0 
  case CC_B(CC_A(_, _, _)) => 1 
  case CC_B(CC_B(CC_A(_, _, _))) => 2 
  case CC_B(CC_B(CC_B(_))) => 3 
  case CC_B(CC_B(CC_C(_, _, _))) => 4 
  case CC_B(CC_C(_, _, _)) => 5 
  case CC_C(CC_A(_, (_,_), _), _, _) => 6 
  case CC_C(CC_B(CC_A(_, _, _)), _, _) => 7 
  case CC_C(CC_B(CC_B(_)), _, _) => 8 
  case CC_C(CC_B(CC_C(_, _, _)), _, _) => 9 
  case CC_C(CC_C(CC_A(_, _, _), _, (_,_)), _, _) => 10 
  case CC_C(CC_C(CC_B(_), _, (_,_)), _, _) => 11 
  case CC_C(CC_C(CC_C(_, _, _), _, (_,_)), _, _) => 12 
}
}