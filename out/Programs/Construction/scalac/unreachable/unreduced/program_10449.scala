package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_B[CC_A], b: Boolean) extends T_A
case class CC_C(a: CC_B, b: CC_A) extends T_B[Byte]
case class CC_D(a: CC_A) extends T_B[Byte]
case class CC_E() extends T_B[Byte]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _), _) => 0 
  case CC_D(CC_A()) => 1 
  case CC_E() => 2 
}
}