package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: T_A[T_B]) extends T_A[T_B]
case class CC_B(a: T_B, b: CC_A) extends T_A[T_B]
case class CC_C(a: Char, b: T_A[T_A[T_B]], c: Int) extends T_B
case class CC_D(a: CC_C, b: T_B) extends T_B
case class CC_E(a: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(_, _) => 1 
}
}
// This is not matched: CC_E(CC_A(_, _))