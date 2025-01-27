package Program_22 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: CC_A, c: T_B[CC_A]) extends T_A
case class CC_C(a: CC_B, b: Char) extends T_A
case class CC_D(a: CC_C, b: CC_B) extends T_B[Boolean]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, _) => 1 
}
}
// This is not matched: CC_C(_, _)