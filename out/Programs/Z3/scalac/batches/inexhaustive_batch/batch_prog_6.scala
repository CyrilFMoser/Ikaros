package Program_6 

 object Test {
sealed trait T_A
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: CC_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_A(_, _), CC_A(_, _))) => 0 
}
}