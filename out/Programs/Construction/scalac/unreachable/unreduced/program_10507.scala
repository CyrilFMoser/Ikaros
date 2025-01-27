package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[(Int,T_A)]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_B, b: (T_B[Byte],CC_B)) extends T_B[Byte]
case class CC_D() extends T_B[Byte]
case class CC_E(a: Boolean) extends T_B[Byte]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}