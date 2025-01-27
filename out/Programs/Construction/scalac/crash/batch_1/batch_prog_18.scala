package Program_18 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C() extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, CC_A(_, _))) => 1 
  case CC_B(CC_A(_, CC_B(_))) => 2 
  case CC_B(CC_A(_, CC_C())) => 3 
}
}
// This is not matched: CC_C()