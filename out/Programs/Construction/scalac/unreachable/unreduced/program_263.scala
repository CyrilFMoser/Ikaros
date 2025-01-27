package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_B[Byte]) extends T_A
case class CC_C(a: T_A) extends T_A
case class CC_D(a: CC_A) extends T_B[Char]
case class CC_E(a: CC_C) extends T_B[Char]
case class CC_F(a: T_B[Byte], b: CC_A) extends T_B[Char]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_D(CC_A()) => 0 
  case CC_F(_, _) => 1 
}
}
// This is not matched: CC_E(CC_C(_))