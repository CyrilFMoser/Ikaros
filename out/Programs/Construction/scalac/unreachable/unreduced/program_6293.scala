package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: T_B, c: T_A[T_A[T_B]]) extends T_A[T_A[T_B]]
case class CC_B() extends T_A[T_A[T_B]]
case class CC_C(a: T_A[T_A[T_B]], b: CC_A, c: CC_B) extends T_B

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(CC_A(_, _, _), CC_A(_, _, _), CC_B()), _) => 0 
  case CC_A(_, CC_C(CC_B(), CC_A(_, _, _), CC_B()), _) => 1 
  case CC_B() => 2 
}
}