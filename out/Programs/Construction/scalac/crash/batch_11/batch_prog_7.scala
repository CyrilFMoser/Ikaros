package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: T_B, c: T_A[Char]) extends T_A[T_A[T_B]]
case class CC_B(a: Int, b: T_B) extends T_A[T_A[T_B]]
case class CC_C(a: CC_B, b: CC_B) extends T_A[T_A[T_B]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
}
}