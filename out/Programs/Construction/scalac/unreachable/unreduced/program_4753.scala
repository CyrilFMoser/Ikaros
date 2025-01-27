package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Int) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: Boolean, b: T_B[(Boolean,T_A)]) extends T_A
case class CC_D() extends T_B[CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_)) => 1 
  case CC_B(CC_B(_)) => 2 
  case CC_B(CC_C(_, _)) => 3 
}
}
// This is not matched: CC_C(_, _)