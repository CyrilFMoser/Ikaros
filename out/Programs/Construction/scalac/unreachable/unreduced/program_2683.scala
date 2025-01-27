package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Int], b: T_A[T_A[T_B]]) extends T_A[T_A[T_B]]
case class CC_B() extends T_A[T_A[T_B]]
case class CC_C(a: (T_A[CC_B],(CC_B,CC_A)), b: Char) extends T_B
case class CC_D(a: CC_A, b: CC_A, c: T_A[T_A[T_B]]) extends T_B
case class CC_E(a: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(CC_A(_, _), _, CC_A(_, CC_A(_, _))) => 1 
  case CC_D(CC_A(_, _), _, CC_A(_, CC_B())) => 2 
  case CC_D(CC_A(_, _), _, CC_B()) => 3 
  case CC_E(CC_A(_, CC_A(_, _))) => 4 
}
}
// This is not matched: CC_E(CC_A(_, CC_B()))