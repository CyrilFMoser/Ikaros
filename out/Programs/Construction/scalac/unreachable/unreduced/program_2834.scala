package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, Boolean]
case class CC_B[D](a: D, b: T_A[D, Boolean]) extends T_A[D, Boolean]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_)) => 0 
  case CC_B(_, CC_B(_, CC_A(_))) => 1 
  case CC_B(_, CC_B(_, CC_B(_, _))) => 2 
}
}