package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: B, b: T_B, c: T_A[Boolean]) extends T_A[Boolean]
case class CC_B[C]() extends T_A[Boolean]
case class CC_C() extends T_B
case class CC_D(a: CC_A[Boolean], b: T_A[Byte]) extends T_B

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(CC_A(_, _, _), _), CC_A(_, _, _)) => 0 
  case CC_A(_, CC_C(), CC_B()) => 1 
  case CC_A(_, CC_D(CC_A(_, _, _), _), CC_B()) => 2 
}
}
// This is not matched: CC_A(_, CC_C(), CC_A(_, _, _))