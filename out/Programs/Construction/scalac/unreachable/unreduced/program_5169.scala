package Program_16 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: Char, b: T_B[T_B[CC_A]], c: Char) extends T_A
case class CC_C(a: CC_B) extends T_B[CC_A]
case class CC_D() extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _, _)) => 0 
  case CC_D() => 1 
}
}