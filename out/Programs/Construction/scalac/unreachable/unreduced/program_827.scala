package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_A, c: T_A) extends T_A
case class CC_B(a: (Byte,CC_A), b: T_B[CC_A]) extends T_A
case class CC_C(a: T_B[CC_B]) extends T_B[Byte]
case class CC_D(a: T_B[Byte], b: T_B[Byte]) extends T_B[Byte]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)) => 0 
  case CC_A(CC_B(_, _), CC_A(_, _, _), CC_A(_, _, _)) => 1 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_B(_, _)) => 2 
  case CC_A(CC_B(_, _), CC_A(_, _, _), CC_B(_, _)) => 3 
  case CC_A(CC_A(_, _, _), CC_B(_, _), CC_A(_, _, _)) => 4 
  case CC_A(CC_B(_, _), CC_B(_, _), CC_A(_, _, _)) => 5 
  case CC_A(CC_A(_, _, _), CC_B(_, _), CC_B(_, _)) => 6 
  case CC_A(CC_B(_, _), CC_B(_, _), CC_B(_, _)) => 7 
  case CC_B((_,_), _) => 8 
}
}