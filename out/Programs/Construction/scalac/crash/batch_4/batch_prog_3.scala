package Program_3 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_A, b: T_B) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
}
}