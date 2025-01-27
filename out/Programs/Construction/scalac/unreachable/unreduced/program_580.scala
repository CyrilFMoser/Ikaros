package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[T_A]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_B, b: T_A, c: T_B[CC_B]) extends T_B[CC_B]
case class CC_D(a: T_A, b: CC_C, c: Int) extends T_B[CC_B]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_, _), _) => 0 
  case CC_C(_, CC_B(), _) => 1 
}
}