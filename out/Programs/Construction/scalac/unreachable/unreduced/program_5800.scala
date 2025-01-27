package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: Byte, c: (T_B[T_A, T_A],T_B[T_A, (Int,Byte)])) extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_A
case class CC_D(a: CC_A, b: T_A, c: CC_A) extends T_B[Char, T_B[CC_B, CC_B]]
case class CC_E() extends T_B[Char, T_B[CC_B, CC_B]]
case class CC_F(a: (T_B[Byte, Char],Byte)) extends T_B[Char, T_B[CC_B, CC_B]]

val v_a: T_B[Char, T_B[CC_B, CC_B]] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(_, _, (_,_)), CC_A(CC_A(_, _, _), _, _)) => 0 
  case CC_D(_, CC_B(), CC_A(CC_A(_, _, _), _, _)) => 1 
  case CC_D(_, CC_C(), CC_A(CC_A(_, _, _), _, _)) => 2 
  case CC_D(_, CC_A(_, _, (_,_)), CC_A(CC_B(), _, _)) => 3 
  case CC_D(_, CC_B(), CC_A(CC_B(), _, _)) => 4 
  case CC_D(_, CC_A(_, _, (_,_)), CC_A(CC_C(), _, _)) => 5 
  case CC_D(_, CC_B(), CC_A(CC_C(), _, _)) => 6 
  case CC_D(_, CC_C(), CC_A(CC_C(), _, _)) => 7 
  case CC_E() => 8 
  case CC_F(_) => 9 
}
}
// This is not matched: CC_D(_, CC_C(), CC_A(CC_B(), _, _))