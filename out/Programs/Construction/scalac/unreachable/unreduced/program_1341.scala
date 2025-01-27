package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C]) extends T_A[C, Byte]
case class CC_B[D](a: CC_A[D]) extends T_A[D, Byte]
case class CC_C(a: CC_B[CC_B[T_B]], b: T_A[(T_B,T_B), Byte]) extends T_B
case class CC_D(a: CC_B[T_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_)) => 0 
  case CC_C(_, CC_B(_)) => 1 
}
}
// This is not matched: CC_D(CC_B(_))