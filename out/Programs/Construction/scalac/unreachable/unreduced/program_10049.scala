package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]], b: T_B, c: T_B) extends T_A[T_B]
case class CC_B(a: T_A[T_B]) extends T_B
case class CC_C(a: Boolean, b: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, CC_B(_), _)) => 0 
  case CC_B(CC_A(_, CC_C(_, _), _)) => 1 
  case CC_C(_, CC_B(_)) => 2 
  case CC_C(_, CC_C(_, _)) => 3 
}
}