package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_A, c: T_B[T_B[T_A]]) extends T_A
case class CC_B(a: T_A, b: CC_A) extends T_B[CC_A]
case class CC_C(a: T_B[CC_B], b: T_A, c: (Byte,(CC_B,T_A))) extends T_B[CC_A]
case class CC_D(a: T_B[CC_A], b: Char) extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_A(_, _, _), _, _), _) => 0 
  case CC_C(_, CC_A(CC_A(_, _, _), CC_A(_, _, _), _), (_,(_,_))) => 1 
  case CC_D(CC_B(CC_A(_, _, _), _), _) => 2 
  case CC_D(CC_C(_, _, (_,_)), _) => 3 
  case CC_D(CC_D(CC_B(_, _), 'x'), _) => 4 
  case CC_D(CC_D(CC_C(_, _, _), 'x'), _) => 5 
  case CC_D(CC_D(CC_D(_, _), 'x'), _) => 6 
  case CC_D(CC_D(CC_B(_, _), _), _) => 7 
  case CC_D(CC_D(CC_C(_, _, _), _), _) => 8 
  case CC_D(CC_D(CC_D(_, _), _), _) => 9 
}
}