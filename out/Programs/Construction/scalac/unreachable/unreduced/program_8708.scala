package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: Byte, b: T_A, c: T_B[CC_A]) extends T_A
case class CC_C() extends T_A
case class CC_D(a: T_B[Boolean], b: CC_A, c: T_A) extends T_B[Boolean]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A(), _) => 1 
  case CC_B(_, CC_B(_, _, _), _) => 2 
  case CC_B(_, CC_C(), _) => 3 
  case CC_C() => 4 
}
}