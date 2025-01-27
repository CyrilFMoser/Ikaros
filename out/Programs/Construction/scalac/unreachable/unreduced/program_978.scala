package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Char, b: Byte, c: T_B[T_A]) extends T_A
case class CC_B[B](a: T_A, b: T_B[B], c: (CC_A,T_A)) extends T_A
case class CC_C(a: CC_A, b: CC_A, c: T_A) extends T_A
case class CC_D(a: CC_C) extends T_B[T_B[CC_B[Boolean]]]
case class CC_E() extends T_B[T_B[CC_B[Boolean]]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), _, _) => 1 
  case CC_B(CC_C(_, _, _), _, _) => 2 
  case CC_C(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)) => 3 
  case CC_C(CC_A(_, _, _), CC_A(_, _, _), CC_B(_, _, _)) => 4 
  case CC_C(CC_A(_, _, _), CC_A(_, _, _), CC_C(_, _, _)) => 5 
}
}
// This is not matched: CC_B(CC_B(_, _, _), _, _)