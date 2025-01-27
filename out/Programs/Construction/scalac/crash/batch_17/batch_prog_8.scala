package Program_8 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: T_A, c: CC_A) extends T_A
case class CC_C(a: CC_B, b: T_A, c: Byte) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(), _) => 0 
  case CC_B(_, CC_B(CC_A(), _, CC_A()), _) => 1 
  case CC_B(_, CC_C(_, _, _), _) => 2 
  case CC_C(_, _, _) => 3 
}
}
// This is not matched: CC_A()