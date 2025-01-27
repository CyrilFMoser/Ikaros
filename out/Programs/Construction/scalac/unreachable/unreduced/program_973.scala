package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (T_A[T_B],Int), b: T_A[T_A[T_B]], c: T_A[T_B]) extends T_A[T_B]
case class CC_B(a: T_B, b: T_A[T_B]) extends T_A[T_B]
case class CC_C(a: CC_A, b: CC_B) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _, _)) => 0 
  case CC_B(_, CC_B(_, _)) => 1 
}
}
// This is not matched: CC_A(_, _, _)