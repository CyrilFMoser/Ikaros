package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Int, b: T_A[T_A[T_B]], c: T_A[T_B]) extends T_A[T_A[T_B]]
case class CC_B() extends T_B
case class CC_C() extends T_B
case class CC_D(a: T_A[T_A[T_B]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C() => 1 
  case CC_D(CC_A(_, CC_A(_, _, _), _)) => 2 
}
}