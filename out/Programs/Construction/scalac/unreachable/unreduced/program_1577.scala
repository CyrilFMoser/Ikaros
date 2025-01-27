package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: T_A[T_B]) extends T_A[T_B]
case class CC_B(a: T_A[CC_A], b: T_B, c: T_A[T_B]) extends T_A[T_B]
case class CC_C() extends T_B
case class CC_D(a: CC_B) extends T_B
case class CC_E(a: Byte) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_B(_, CC_C(), _) => 1 
  case CC_B(_, CC_D(_), _) => 2 
  case CC_B(_, CC_E(_), _) => 3 
}
}
// This is not matched: CC_A(_, CC_B(_, _, _))