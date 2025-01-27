package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C(a: T_B[CC_B], b: Byte, c: T_A) extends T_A
case class CC_D(a: CC_B, b: T_A, c: CC_A) extends T_B[CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A()) => 1 
  case CC_C(_, _, _) => 2 
}
}