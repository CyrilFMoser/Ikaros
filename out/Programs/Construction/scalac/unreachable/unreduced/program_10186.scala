package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_B]
case class CC_B(a: T_A[T_B], b: T_A[T_B]) extends T_A[T_B]
case class CC_C(a: T_A[CC_A], b: T_A[CC_A]) extends T_A[T_B]
case class CC_D(a: T_B) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
  case CC_B(_, CC_B(_, _)) => 2 
  case CC_B(_, CC_C(_, _)) => 3 
}
}
// This is not matched: CC_C(_, _)