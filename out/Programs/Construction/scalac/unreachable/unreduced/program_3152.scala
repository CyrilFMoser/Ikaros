package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Boolean], b: T_A[T_A[C, Boolean], C], c: T_A[C, C]) extends T_A[C, Boolean]
case class CC_B[D](a: T_A[Byte, Boolean]) extends T_A[D, Boolean]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _)) => 0 
  case CC_B(CC_B(CC_A(_, _, _))) => 1 
  case CC_B(CC_B(CC_B(_))) => 2 
}
}