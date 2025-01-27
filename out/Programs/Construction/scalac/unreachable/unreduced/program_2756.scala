package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (Char,T_A), b: T_A) extends T_A
case class CC_B(a: T_A, b: T_A, c: T_B[CC_A]) extends T_A
case class CC_C(a: T_A, b: Byte, c: T_A) extends T_B[T_A]
case class CC_D(a: CC_C, b: CC_A, c: CC_A) extends T_B[T_A]
case class CC_E(a: Char) extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_A((_,_), _)) => 0 
  case CC_C(_, _, CC_B(_, CC_A(_, _), _)) => 1 
  case CC_C(_, _, CC_B(_, CC_B(_, _, _), _)) => 2 
  case CC_D(CC_C(CC_A(_, _), _, CC_A(_, _)), CC_A(_, CC_A(_, _)), CC_A((_,_), _)) => 3 
  case CC_D(CC_C(CC_A(_, _), _, CC_B(_, _, _)), CC_A(_, CC_A(_, _)), CC_A((_,_), _)) => 4 
  case CC_D(CC_C(CC_B(_, _, _), _, CC_A(_, _)), CC_A(_, CC_A(_, _)), CC_A((_,_), _)) => 5 
  case CC_D(CC_C(CC_B(_, _, _), _, CC_B(_, _, _)), CC_A(_, CC_A(_, _)), CC_A((_,_), _)) => 6 
  case CC_D(CC_C(CC_A(_, _), _, CC_B(_, _, _)), CC_A(_, CC_B(_, _, _)), CC_A((_,_), _)) => 7 
  case CC_D(CC_C(CC_B(_, _, _), _, CC_A(_, _)), CC_A(_, CC_B(_, _, _)), CC_A((_,_), _)) => 8 
  case CC_D(CC_C(CC_B(_, _, _), _, CC_B(_, _, _)), CC_A(_, CC_B(_, _, _)), CC_A((_,_), _)) => 9 
  case CC_E('x') => 10 
  case CC_E(_) => 11 
}
}
// This is not matched: CC_D(CC_C(CC_A(_, _), _, CC_A(_, _)), CC_A(_, CC_B(_, _, _)), CC_A((_,_), _))