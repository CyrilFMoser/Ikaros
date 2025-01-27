package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[T_B, C]
case class CC_B[D](a: T_A[T_B, D], b: T_B, c: CC_A[D]) extends T_B

val v_a: T_A[T_B, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, CC_B(_, _, _), _)) => 0 
}
}