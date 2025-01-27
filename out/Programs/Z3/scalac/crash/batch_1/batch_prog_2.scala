package Program_2 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C(a: CC_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_A(CC_C(_), CC_A(_, _)) => 1 
  case CC_A(CC_B(_), CC_A(_, _)) => 2 
}
}
// This is not matched: (CC_B Wildcard T_A)