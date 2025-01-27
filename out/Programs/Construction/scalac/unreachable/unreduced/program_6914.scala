package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Boolean) extends T_A[T_A[T_B]]
case class CC_B(a: T_B, b: T_A[T_A[T_B]], c: T_B) extends T_B
case class CC_C(a: T_A[CC_B], b: CC_A, c: Char) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(true), CC_B(CC_B(_, _, _), _, _)) => 0 
  case CC_B(_, CC_A(false), CC_B(CC_B(_, _, _), _, _)) => 1 
  case CC_B(_, CC_A(true), CC_B(CC_C(_, _, _), _, _)) => 2 
  case CC_B(_, CC_A(false), CC_B(CC_C(_, _, _), _, _)) => 3 
  case CC_B(_, CC_A(true), CC_B(CC_D(), _, _)) => 4 
  case CC_B(_, CC_A(false), CC_B(CC_D(), _, _)) => 5 
  case CC_B(_, CC_A(true), CC_C(_, CC_A(_), _)) => 6 
  case CC_B(_, CC_A(false), CC_C(_, CC_A(_), _)) => 7 
  case CC_B(_, CC_A(true), CC_D()) => 8 
  case CC_B(_, CC_A(false), CC_D()) => 9 
  case CC_C(_, _, _) => 10 
  case CC_D() => 11 
}
}