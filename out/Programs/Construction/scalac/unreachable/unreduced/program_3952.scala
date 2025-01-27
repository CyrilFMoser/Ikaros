package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B, b: T_B) extends T_A[T_A[T_B, T_B], T_A[T_B, T_B]]
case class CC_B() extends T_B
case class CC_C(a: T_B, b: T_A[T_A[T_B, T_B], T_A[T_B, T_B]]) extends T_B
case class CC_D(a: T_A[T_B, CC_A]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_C(_, _), _) => 1 
  case CC_C(CC_D(_), _) => 2 
  case CC_D(_) => 3 
}
}
// This is not matched: CC_C(CC_B(), _)