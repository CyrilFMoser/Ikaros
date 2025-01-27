package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[Byte]
case class CC_B(a: T_A[Char]) extends T_A[Byte]
case class CC_C() extends T_B
case class CC_D() extends T_B
case class CC_E(a: CC_C, b: T_A[CC_B], c: CC_B) extends T_B

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}