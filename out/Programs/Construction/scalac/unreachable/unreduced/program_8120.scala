package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[Boolean, T_B[Boolean, T_A]], c: T_B[(T_A,Boolean), T_A]) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: T_B[Char, Byte], b: T_A, c: T_B[T_A, T_B[Char, CC_B]]) extends T_A
case class CC_D[C](a: CC_A, b: T_A) extends T_B[C, Boolean]
case class CC_E(a: T_B[CC_D[T_A], Boolean], b: Byte) extends T_B[Int, Boolean]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(CC_A(_, _, _), _, _)) => 1 
  case CC_B(CC_A(CC_B(_), _, _)) => 2 
  case CC_B(CC_A(CC_C(_, _, _), _, _)) => 3 
  case CC_B(CC_B(_)) => 4 
  case CC_C(_, _, _) => 5 
}
}
// This is not matched: CC_B(CC_C(_, _, _))