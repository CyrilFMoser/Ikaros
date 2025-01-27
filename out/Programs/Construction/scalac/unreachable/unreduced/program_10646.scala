package Program_23 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[Int], b: T_A, c: T_B[T_B[Boolean]]) extends T_A
case class CC_B(a: T_A, b: CC_A, c: T_A) extends T_A
case class CC_C(a: Byte, b: CC_A, c: T_B[Boolean]) extends T_B[T_B[CC_B]]
case class CC_D() extends T_B[T_B[CC_B]]
case class CC_E() extends T_B[T_B[CC_B]]

val v_a: T_B[T_B[CC_B]] = null
val v_b: Int = v_a match{
  case CC_C(0, _, _) => 0 
  case CC_C(_, _, _) => 1 
  case CC_D() => 2 
}
}
// This is not matched: CC_E()