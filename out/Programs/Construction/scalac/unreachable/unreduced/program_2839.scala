package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[(T_A,T_A)]) extends T_A
case class CC_B(a: T_A, b: CC_A, c: Char) extends T_A
case class CC_C(a: CC_A, b: (((Char,Byte),CC_B),Char), c: Char) extends T_A
case class CC_D(a: CC_A, b: T_A, c: CC_B) extends T_B[Char]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), CC_A(_), 'x') => 1 
  case CC_B(CC_B(CC_A(_), CC_A(_), _), CC_A(_), 'x') => 2 
  case CC_B(CC_B(CC_A(_), CC_A(_), _), CC_A(_), _) => 3 
  case CC_B(CC_B(CC_B(_, _, _), CC_A(_), _), CC_A(_), 'x') => 4 
  case CC_B(CC_B(CC_B(_, _, _), CC_A(_), _), CC_A(_), _) => 5 
  case CC_B(CC_B(CC_C(_, _, _), CC_A(_), _), CC_A(_), 'x') => 6 
  case CC_B(CC_B(CC_C(_, _, _), CC_A(_), _), CC_A(_), _) => 7 
  case CC_B(CC_C(CC_A(_), (_,_), 'x'), CC_A(_), 'x') => 8 
  case CC_B(CC_C(CC_A(_), (_,_), 'x'), CC_A(_), _) => 9 
  case CC_B(CC_C(CC_A(_), (_,_), _), CC_A(_), 'x') => 10 
  case CC_B(CC_C(CC_A(_), (_,_), _), CC_A(_), _) => 11 
  case CC_C(_, ((_,_),_), _) => 12 
}
}
// This is not matched: CC_B(CC_A(_), CC_A(_), _)