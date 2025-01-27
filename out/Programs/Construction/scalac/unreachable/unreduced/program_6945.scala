package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B]) extends T_A[T_B]
case class CC_B(a: T_A[T_A[T_B]]) extends T_A[T_B]
case class CC_C(a: Boolean, b: Char) extends T_B
case class CC_D(a: T_A[T_B]) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_)) => 1 
  case CC_B(_) => 2 
}
}