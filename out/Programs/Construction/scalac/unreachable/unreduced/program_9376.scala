package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[Int, T_B]]
case class CC_B() extends T_B
case class CC_C(a: T_B, b: CC_A[(CC_B,T_B)]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_B(), CC_A(_)) => 1 
  case CC_C(CC_C(CC_C(_, _), CC_A(_)), CC_A(_)) => 2 
}
}
// This is not matched: CC_C(CC_C(CC_B(), CC_A(_)), CC_A(_))