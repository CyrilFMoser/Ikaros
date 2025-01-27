package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: Char, b: T_B[(CC_A,(Int,Byte))]) extends T_A
case class CC_C(a: Byte) extends T_A
case class CC_D(a: (CC_C,T_A), b: Char) extends T_B[CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C(_)