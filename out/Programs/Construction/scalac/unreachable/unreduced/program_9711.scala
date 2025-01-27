package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Int, b: T_A, c: Char) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: T_B[CC_A]) extends T_A
case class CC_D() extends T_B[T_B[T_B[Boolean]]]
case class CC_E(a: CC_B) extends T_B[T_B[T_B[Boolean]]]

val v_a: T_B[T_B[T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_E(CC_B(CC_A(_, _, _))) => 0 
  case CC_E(CC_B(CC_B(_))) => 1 
  case CC_E(CC_B(CC_C(_))) => 2 
}
}
// This is not matched: CC_D()