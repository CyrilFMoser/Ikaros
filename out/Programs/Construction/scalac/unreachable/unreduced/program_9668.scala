package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: (T_A,T_A), c: T_B[Char, T_A]) extends T_A
case class CC_B(a: (CC_A,T_A), b: (T_B[T_A, Char],T_B[T_A, T_A])) extends T_A
case class CC_C(a: (T_A,Boolean), b: CC_A) extends T_A
case class CC_D[C](a: C, b: C, c: CC_C) extends T_B[T_A, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), (_,_), _), _, _) => 0 
  case CC_A(CC_A(CC_B(_, _), (_,_), _), _, _) => 1 
  case CC_A(CC_A(CC_C(_, _), (_,_), _), _, _) => 2 
  case CC_A(CC_B(_, _), _, _) => 3 
  case CC_A(CC_C(_, _), _, _) => 4 
  case CC_B((CC_A(_, _, _),CC_A(_, _, _)), _) => 5 
  case CC_B((CC_A(_, _, _),CC_B(_, _)), _) => 6 
  case CC_B((CC_A(_, _, _),CC_C(_, _)), _) => 7 
  case CC_C(_, _) => 8 
}
}