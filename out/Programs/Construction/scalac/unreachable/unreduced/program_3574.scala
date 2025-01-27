package Program_16 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_A, b: T_A, c: T_B[CC_B]) extends T_A
case class CC_D() extends T_B[Byte]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, CC_A(), _) => 1 
  case CC_C(_, CC_B(), _) => 2 
  case CC_C(_, CC_C(_, _, _), _) => 3 
}
}
// This is not matched: CC_B()