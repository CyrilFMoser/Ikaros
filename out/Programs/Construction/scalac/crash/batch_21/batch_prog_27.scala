package Program_27 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_B(a: (T_A,CC_A), b: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}