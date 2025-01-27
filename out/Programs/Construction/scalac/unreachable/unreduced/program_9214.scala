package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[T_B, T_B]) extends T_A[T_B, C]
case class CC_B() extends T_B
case class CC_C[D](a: CC_B) extends T_B
case class CC_D(a: CC_A[Boolean], b: T_A[T_A[T_B, T_B], (Char,T_B)], c: CC_C[T_A[T_B, Char]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_B()) => 1 
  case CC_D(_, _, CC_C(CC_B())) => 2 
}
}