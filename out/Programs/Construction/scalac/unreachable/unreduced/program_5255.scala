package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A]) extends T_A
case class CC_B(a: T_A, b: T_B[T_A]) extends T_B[Boolean]
case class CC_C(a: CC_B, b: T_A, c: CC_B) extends T_B[Boolean]
case class CC_D() extends T_B[Boolean]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_), _) => 0 
  case CC_C(CC_B(_, _), CC_A(_), CC_B(_, _)) => 1 
  case CC_D() => 2 
}
}