package Program_15 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: T_A, b: (Boolean,Boolean), c: Boolean) extends T_A
case class CC_C(a: CC_A) extends T_A

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
}
}