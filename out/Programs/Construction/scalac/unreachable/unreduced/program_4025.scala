package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: (T_B,(T_B,T_B)), c: T_B) extends T_A[(Char,(T_B,T_B))]
case class CC_B[B](a: Byte, b: CC_A, c: CC_A) extends T_B
case class CC_C() extends T_B
case class CC_D(a: T_A[CC_C]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_) => 1 
}
}
// This is not matched: CC_B(_, _, _)