package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Int, b: T_B) extends T_A[(T_B,Byte)]
case class CC_B() extends T_B
case class CC_C(a: CC_A) extends T_B
case class CC_D(a: Byte, b: CC_A, c: T_A[CC_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A(_, CC_B())) => 1 
  case CC_C(CC_A(_, CC_C(_))) => 2 
  case CC_C(CC_A(_, CC_D(_, _, _))) => 3 
  case CC_D(_, _, _) => 4 
}
}