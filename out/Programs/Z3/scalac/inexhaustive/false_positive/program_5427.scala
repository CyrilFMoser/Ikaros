package Program_14 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_D(a: CC_A, b: T_A, c: (T_A,CC_B)) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(_, _, (CC_A(),_)) => 0 
}
}
// This is not matched: (CC_A T_A T_A)