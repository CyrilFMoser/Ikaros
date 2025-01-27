package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: T_B[T_A]) extends T_A
case class CC_B(a: CC_A, b: CC_A, c: Boolean) extends T_A
case class CC_C(a: CC_B) extends T_B[CC_B]
case class CC_D(a: T_A) extends T_B[CC_B]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _)) => 0 
  case CC_D(CC_B(_, _, _)) => 1 
}
}