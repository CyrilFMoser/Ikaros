package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Boolean, b: T_A[T_B], c: T_B) extends T_A[Char]
case class CC_B(a: T_A[Char]) extends T_B
case class CC_C() extends T_B
case class CC_D(a: T_A[T_A[CC_A]], b: T_B, c: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C() => 1 
  case CC_D(_, CC_B(CC_A(_, _, _)), _) => 2 
  case CC_D(_, CC_C(), _) => 3 
  case CC_D(_, CC_D(_, CC_B(_), CC_B(_)), _) => 4 
  case CC_D(_, CC_D(_, CC_C(), CC_B(_)), _) => 5 
  case CC_D(_, CC_D(_, CC_D(_, _, _), CC_B(_)), _) => 6 
  case CC_D(_, CC_D(_, CC_B(_), CC_C()), _) => 7 
  case CC_D(_, CC_D(_, CC_C(), CC_C()), _) => 8 
  case CC_D(_, CC_D(_, CC_D(_, _, _), CC_C()), _) => 9 
  case CC_D(_, CC_D(_, CC_B(_), CC_D(_, _, _)), _) => 10 
  case CC_D(_, CC_D(_, CC_D(_, _, _), CC_D(_, _, _)), _) => 11 
}
}
// This is not matched: CC_D(_, CC_D(_, CC_C(), CC_D(_, _, _)), _)