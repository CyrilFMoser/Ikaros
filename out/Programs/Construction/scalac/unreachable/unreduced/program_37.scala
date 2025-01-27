package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[T_B, T_B], b: T_A[T_B, T_B], c: T_A[Char, T_B]) extends T_A[T_B, T_A[T_B, T_A[T_B, T_B]]]
case class CC_B(a: CC_A) extends T_B
case class CC_C() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _)) => 0 
  case CC_C() => 1 
}
}