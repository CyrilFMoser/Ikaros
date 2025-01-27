package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[(T_A[Boolean, Byte],(T_B,T_B)), C]
case class CC_B() extends T_B
case class CC_C() extends T_B
case class CC_D(a: CC_A[Boolean]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_A(_, _)) => 1 
}
}
// This is not matched: CC_B()