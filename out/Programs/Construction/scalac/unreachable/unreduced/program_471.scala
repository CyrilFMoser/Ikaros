package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Char) extends T_A
case class CC_B(a: T_B[CC_A]) extends T_B[Byte]
case class CC_C() extends T_B[Byte]
case class CC_D() extends T_B[Boolean]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C() => 1 
}
}