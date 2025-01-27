package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[Boolean]) extends T_A[Boolean]
case class CC_B() extends T_B
case class CC_C(a: T_A[Boolean], b: Byte, c: T_A[CC_A]) extends T_B

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(), CC_A(_, _)) => 0 
  case CC_A(CC_C(_, _, _), CC_A(_, _)) => 1 
}
}