package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[T_A]) extends T_A
case class CC_B(a: (CC_A,Byte), b: CC_A, c: Int) extends T_A
case class CC_C(a: T_A, b: Boolean, c: Byte) extends T_A
case class CC_D(a: Byte) extends T_B[Char]
case class CC_E(a: T_B[T_A]) extends T_B[Char]
case class CC_F(a: (T_B[CC_E],Char)) extends T_B[Char]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B((_,_), CC_A(_, _), _), _) => 1 
  case CC_A(CC_C(_, _, _), _) => 2 
  case CC_B((CC_A(_, _),_), _, _) => 3 
  case CC_C(CC_A(CC_A(_, _), _), _, _) => 4 
  case CC_C(CC_A(CC_B(_, _, _), _), _, _) => 5 
  case CC_C(CC_A(CC_C(_, _, _), _), _, _) => 6 
  case CC_C(CC_B(_, _, _), _, _) => 7 
  case CC_C(CC_C(CC_A(_, _), _, _), _, _) => 8 
  case CC_C(CC_C(CC_B(_, _, _), _, _), _, _) => 9 
}
}
// This is not matched: CC_C(CC_C(CC_C(_, _, _), _, _), _, _)