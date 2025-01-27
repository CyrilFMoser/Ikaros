package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[T_B, C], c: Byte) extends T_A[T_B, C]
case class CC_B(a: T_A[(T_B,T_B), T_A[T_B, T_B]], b: T_A[Int, ((Boolean,Int),T_B)]) extends T_B
case class CC_C(a: CC_A[CC_A[CC_B]]) extends T_B
case class CC_D(a: T_B, b: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(CC_A(_, _, _)) => 1 
}
}
// This is not matched: CC_D(_, _)