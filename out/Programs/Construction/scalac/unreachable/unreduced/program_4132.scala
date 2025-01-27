package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_A[T_B], b: T_A[T_B]) extends T_A[T_B]
case class CC_B(a: CC_A[CC_A[T_B]]) extends T_A[T_B]
case class CC_C(a: T_A[T_A[T_B]], b: T_A[T_B], c: Boolean) extends T_B
case class CC_D(a: CC_B) extends T_B
case class CC_E(a: Boolean, b: Char) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_E(_, _) => 1 
}
}
// This is not matched: CC_D(CC_B(CC_A(_, _)))