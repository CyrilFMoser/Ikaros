package Program_16 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: Int, c: CC_A) extends T_A
case class CC_C(a: T_B[CC_A]) extends T_A
case class CC_D(a: CC_B) extends T_B[CC_C]
case class CC_E() extends T_B[CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, _) => 1 
  case CC_C(_) => 2 
}
}