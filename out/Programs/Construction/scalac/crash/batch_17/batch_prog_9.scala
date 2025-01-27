package Program_9 

object Test {
sealed trait T_A
case class CC_A(a: T_A) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C(a: CC_B, b: CC_A, c: Int) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(CC_B(_))) => 1 
  case CC_B(CC_A(CC_C(_, _, _))) => 2 
  case CC_C(_, CC_A(_), _) => 3 
}
}
// This is not matched: CC_B(CC_A(CC_A(_)))