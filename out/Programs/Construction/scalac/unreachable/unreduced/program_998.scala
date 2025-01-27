package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Boolean) extends T_A[Char, C]
case class CC_B(a: T_A[T_B, T_B], b: T_B, c: T_B) extends T_B
case class CC_C(a: Int, b: Boolean, c: CC_A[Byte]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, _, _), _) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B(_, CC_C(_, _, _), _)