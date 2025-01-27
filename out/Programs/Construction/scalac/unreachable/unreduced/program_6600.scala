package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: Byte, b: (T_A[T_B, T_B],T_A[T_B, T_B]), c: T_A[T_A[T_B, T_B], Int]) extends T_A[T_B, T_B]
case class CC_B(a: T_A[T_B, T_B]) extends T_B
case class CC_C(a: T_B) extends T_B
case class CC_D(a: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(CC_B(CC_A(_, _, _))) => 1 
  case CC_C(CC_C(CC_C(_))) => 2 
  case CC_C(CC_C(CC_D(_))) => 3 
  case CC_C(CC_D(_)) => 4 
  case CC_D(CC_B(_)) => 5 
}
}
// This is not matched: CC_C(CC_C(CC_B(_)))