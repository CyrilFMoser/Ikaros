package Program_26 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: T_A[T_A[Boolean]]) extends T_A[T_A[Boolean]]
case class CC_B(a: Int, b: T_A[T_A[Boolean]]) extends T_A[T_A[Boolean]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _)) => 0 
  case CC_B(_, CC_B(_, CC_A(_, _))) => 1 
  case CC_B(_, CC_B(_, CC_B(_, _))) => 2 
}
}