package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: Byte, c: T_A) extends T_A
case class CC_B(a: CC_A, b: Byte, c: T_B[CC_A, CC_A]) extends T_A
case class CC_C[C, D](a: CC_A, b: C) extends T_B[Byte, C]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, CC_A(CC_A(_, _, _), _, _)) => 0 
  case CC_A(CC_A(_, _, _), _, CC_B(_, _, _)) => 1 
  case CC_A(CC_B(_, _, _), _, CC_A(CC_A(_, _, _), _, _)) => 2 
  case CC_A(CC_B(_, _, _), _, CC_A(CC_B(_, _, _), _, _)) => 3 
  case CC_A(CC_B(_, _, _), _, CC_B(_, _, _)) => 4 
}
}
// This is not matched: CC_A(CC_A(_, _, _), _, CC_A(CC_B(_, _, _), _, _))