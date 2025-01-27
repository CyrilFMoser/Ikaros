package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Char, b: Byte) extends T_A
case class CC_B(a: T_B[T_B[CC_A]], b: Boolean) extends T_A
case class CC_C(a: T_B[(CC_B,CC_B)]) extends T_A
case class CC_D(a: T_B[Char]) extends T_B[Char]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_) => 2 
}
}