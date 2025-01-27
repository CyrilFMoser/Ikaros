package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: T_B[T_B[(Char,Int), T_A], T_A]) extends T_A
case class CC_C() extends T_B[CC_A, T_A]
case class CC_D(a: T_B[Char, Boolean], b: Char) extends T_B[Char, Boolean]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), CC_A(_, CC_A(_, _))) => 0 
  case CC_A(CC_A(_, _), CC_A(_, CC_B(_))) => 1 
  case CC_A(CC_A(_, _), CC_B(_)) => 2 
  case CC_A(CC_B(_), CC_A(_, CC_A(_, _))) => 3 
  case CC_A(CC_B(_), CC_A(_, CC_B(_))) => 4 
  case CC_A(CC_B(_), CC_B(_)) => 5 
  case CC_B(_) => 6 
}
}