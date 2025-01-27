package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A() extends T_A[T_A[T_B, T_B], T_B]
case class CC_B(a: Int, b: T_A[T_B, T_B]) extends T_A[T_A[T_B, T_B], T_B]
case class CC_C() extends T_B
case class CC_D(a: T_B) extends T_B
case class CC_E(a: T_A[T_A[Boolean, CC_A], CC_D], b: T_A[T_A[CC_B, T_B], CC_D]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_C()) => 1 
  case CC_D(CC_D(_)) => 2 
  case CC_E(_, _) => 3 
}
}
// This is not matched: CC_D(CC_E(_, _))