package Program_22 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_B(a: T_A, b: CC_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), CC_A()) => 1 
  case CC_B(CC_B(_, _), CC_A()) => 2 
}
}