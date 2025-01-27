package Program_3 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A() extends T_A
case class CC_B(a: T_A, b: T_A) extends T_A
case class CC_C(a: Char, b: Boolean) extends T_A
case class CC_D(a: T_A) extends T_B
case class CC_E(a: CC_A, b: Int, c: Char) extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
  case CC_B(_, CC_B(_, _)) => 2 
  case CC_B(_, CC_C(_, _)) => 3 
  case CC_C(_, _) => 4 
}
}