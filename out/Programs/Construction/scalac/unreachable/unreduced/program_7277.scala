package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte, b: T_A, c: T_B[T_B[T_A, T_A], T_A]) extends T_A
case class CC_B(a: Int) extends T_A
case class CC_C(a: CC_B, b: CC_B, c: T_A) extends T_A
case class CC_D() extends T_B[CC_A, CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_, CC_B(_), CC_A(_, CC_A(_, _, _), _)) => 2 
  case CC_C(_, CC_B(_), CC_A(_, CC_B(_), _)) => 3 
  case CC_C(_, CC_B(_), CC_A(_, CC_C(_, _, _), _)) => 4 
  case CC_C(_, CC_B(_), CC_B(_)) => 5 
  case CC_C(_, CC_B(_), CC_C(_, _, _)) => 6 
}
}