package Program_29 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_B, b: T_B, c: T_B) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C(a: CC_B, b: (CC_B,T_B), c: CC_B) extends T_A
case class CC_D(a: CC_A, b: T_A, c: T_A) extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_, _, _), _, CC_D(_, _, _)) => 0 
  case CC_B(CC_A(_, _, _)) => 1 
  case CC_C(CC_B(_), _, CC_B(_)) => 2 
}
}