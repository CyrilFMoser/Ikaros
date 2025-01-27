package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Byte, b: Boolean) extends T_A[T_B]
case class CC_B(a: T_A[T_B]) extends T_A[T_B]
case class CC_C(a: T_B, b: T_A[CC_A]) extends T_A[T_B]

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_B(_)) => 1 
  case CC_B(CC_C(_, _)) => 2 
  case CC_C(_, _) => 3 
}
}
// This is not matched: CC_B(CC_A(_, _))