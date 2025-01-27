package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[T_A]]) extends T_A
case class CC_B(a: T_B[CC_A], b: T_A, c: T_A) extends T_A
case class CC_C() extends T_B[CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_), CC_A(_)) => 1 
  case CC_B(_, CC_A(_), CC_B(_, _, _)) => 2 
  case CC_B(_, CC_B(_, _, _), CC_B(_, _, _)) => 3 
}
}
// This is not matched: CC_B(_, CC_B(_, _, _), CC_A(_))