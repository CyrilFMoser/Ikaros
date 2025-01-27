package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: T_B, c: Int) extends T_A[T_B]
case class CC_B() extends T_A[T_B]
case class CC_C() extends T_A[T_B]
case class CC_D(a: T_A[T_B], b: CC_A, c: CC_A) extends T_B
case class CC_E(a: T_A[T_A[T_B]]) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, _), CC_D(_, CC_A(_, _, _), _), _) => 0 
  case CC_A(CC_A(CC_B(), _, _), CC_D(_, CC_A(_, _, _), _), _) => 1 
  case CC_A(CC_A(CC_C(), _, _), CC_D(_, CC_A(_, _, _), _), _) => 2 
  case CC_A(CC_B(), CC_D(_, CC_A(_, _, _), _), _) => 3 
  case CC_A(CC_C(), CC_D(_, CC_A(_, _, _), _), _) => 4 
  case CC_A(CC_A(CC_A(_, _, _), _, _), CC_E(_), _) => 5 
  case CC_A(CC_A(CC_C(), _, _), CC_E(_), _) => 6 
  case CC_A(CC_B(), CC_E(_), _) => 7 
  case CC_A(CC_C(), CC_E(_), _) => 8 
  case CC_B() => 9 
  case CC_C() => 10 
}
}
// This is not matched: CC_A(CC_A(CC_B(), _, _), CC_E(_), _)