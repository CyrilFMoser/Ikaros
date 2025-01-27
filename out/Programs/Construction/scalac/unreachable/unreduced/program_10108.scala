package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Byte, b: Char, c: T_A[T_B]) extends T_A[T_A[T_B]]
case class CC_B() extends T_A[T_A[T_B]]
case class CC_C(a: CC_B, b: T_A[CC_B]) extends T_A[T_A[T_B]]
case class CC_D(a: T_A[CC_A], b: T_A[T_A[T_B]]) extends T_B
case class CC_E(a: Byte, b: T_A[T_A[T_B]], c: Int) extends T_B

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_B(), _) => 2 
}
}