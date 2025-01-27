package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Char) extends T_A[Boolean]
case class CC_B(a: T_A[T_A[Boolean]]) extends T_A[Boolean]
case class CC_C(a: CC_B, b: CC_A) extends T_A[Boolean]
case class CC_D(a: CC_C) extends T_B
case class CC_E(a: CC_D) extends T_B

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_B(_), CC_A(_)) => 2 
}
}