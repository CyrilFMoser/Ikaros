package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[T_A]) extends T_A
case class CC_B(a: Char, b: T_B[CC_A]) extends T_A
case class CC_C(a: T_B[Boolean]) extends T_A
case class CC_D(a: CC_C) extends T_B[Char]
case class CC_E() extends T_B[Boolean]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(CC_E()) => 1 
}
}
// This is not matched: CC_B(_, _)