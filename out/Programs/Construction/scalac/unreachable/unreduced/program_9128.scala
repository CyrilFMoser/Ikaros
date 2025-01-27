package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Byte, b: T_A) extends T_A
case class CC_B(a: Byte, b: T_A) extends T_B[CC_A]
case class CC_C(a: T_B[Char], b: CC_B) extends T_B[CC_B]
case class CC_D(a: T_A) extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B(_, _)) => 0 
  case CC_D(CC_A(_, _)) => 1 
}
}