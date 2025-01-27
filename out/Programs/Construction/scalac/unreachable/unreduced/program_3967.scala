package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[Byte], b: Byte) extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_A
case class CC_D(a: T_A) extends T_B[Byte]
case class CC_E(a: T_B[Char], b: CC_C) extends T_B[Byte]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_D(CC_A(_, _)), _) => 0 
  case CC_A(CC_D(CC_B()), _) => 1 
  case CC_A(CC_D(CC_C()), _) => 2 
  case CC_A(CC_E(_, CC_C()), _) => 3 
  case CC_B() => 4 
}
}
// This is not matched: CC_C()