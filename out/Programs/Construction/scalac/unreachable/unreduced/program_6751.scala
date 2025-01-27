package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_B, c: T_A[C, C]) extends T_A[T_A[T_A[T_B, T_B], (T_B,T_B)], (Int,T_A[T_B, Char])]
case class CC_B[D](a: CC_A[D], b: Boolean) extends T_B
case class CC_C(a: CC_A[T_A[T_B, T_B]], b: Int) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(CC_A(CC_B(_, _), _, _), _) => 1 
  case CC_C(CC_A(CC_C(_, _), _, _), _) => 2 
}
}