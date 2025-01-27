package Program_12 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_B, b: Int, c: T_A) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C(a: ((CC_B,T_A),CC_B), b: CC_A) extends T_B
case class CC_D(a: T_A, b: CC_B, c: CC_C) extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, CC_A(_, _, _)), _, _) => 0 
  case CC_A(CC_D(CC_A(_, _, _), CC_B(_), CC_C(_, _)), _, _) => 1 
  case CC_A(CC_D(CC_B(_), CC_B(_), CC_C(_, _)), _, _) => 2 
  case CC_B(_) => 3 
}
}