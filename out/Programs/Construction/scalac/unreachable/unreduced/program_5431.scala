package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Char, b: T_A, c: T_A) extends T_A
case class CC_B(a: CC_A, b: ((T_A,Char),T_B[(Byte,Byte)]), c: T_B[Boolean]) extends T_A
case class CC_C(a: CC_A, b: CC_A) extends T_B[CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_A(_, CC_A(_, _, _), CC_B(_, _, _))) => 1 
  case CC_A(_, _, CC_A(_, CC_B(_, _, _), CC_A(_, _, _))) => 2 
  case CC_A(_, _, CC_A(_, CC_B(_, _, _), CC_B(_, _, _))) => 3 
  case CC_A(_, _, CC_B(_, (_,_), _)) => 4 
  case CC_B(CC_A(_, CC_B(_, _, _), CC_A(_, _, _)), ((_,_),_), _) => 5 
  case CC_B(CC_A(_, CC_A(_, _, _), CC_B(_, _, _)), ((_,_),_), _) => 6 
  case CC_B(CC_A(_, CC_B(_, _, _), CC_B(_, _, _)), ((_,_),_), _) => 7 
}
}
// This is not matched: CC_B(CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), ((_,_),_), _)