package Program_31 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: T_A) extends T_A

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A()) => 0 
}
}
// This is not matched: CC_B(CC_A(), (CC_D(_, _, _),CC_A()), CC_D(_, CC_A(), _))