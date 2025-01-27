package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: Int, b: CC_A, c: T_B[CC_A]) extends T_B[Byte]
case class CC_C(a: Byte) extends T_B[Byte]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(), _) => 0 
  case CC_C(_) => 1 
}
}