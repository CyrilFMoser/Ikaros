package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: Int) extends T_A[T_A[T_B]]
case class CC_B() extends T_B
case class CC_C(a: CC_A, b: T_A[T_B]) extends T_B
case class CC_D(a: CC_B, b: T_A[T_A[T_B]], c: T_A[T_A[T_B]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A(_, _), _) => 1 
}
}
// This is not matched: CC_D(CC_B(), _, _)