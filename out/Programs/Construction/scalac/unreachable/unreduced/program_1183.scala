package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[T_B, T_B], b: T_A[T_B, T_B], c: T_B) extends T_A[T_B, T_B]
case class CC_B() extends T_A[T_B, T_B]
case class CC_C(a: CC_B, b: CC_A, c: T_A[T_A[T_B, T_B], Int]) extends T_A[T_B, T_B]
case class CC_D(a: T_A[CC_A, (CC_A,T_B)], b: T_B) extends T_B
case class CC_E(a: T_A[T_B, T_B], b: Byte, c: CC_D) extends T_B

val v_a: T_A[T_B, T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), CC_E(_, _, _)) => 0 
  case CC_A(_, CC_B(), CC_D(_, _)) => 1 
  case CC_A(_, CC_B(), CC_E(_, _, _)) => 2 
  case CC_A(_, CC_C(_, _, _), CC_D(_, _)) => 3 
  case CC_A(_, CC_C(_, _, _), CC_E(_, _, _)) => 4 
  case CC_B() => 5 
  case CC_C(_, _, _) => 6 
}
}
// This is not matched: CC_A(_, CC_A(_, _, _), CC_D(_, _))