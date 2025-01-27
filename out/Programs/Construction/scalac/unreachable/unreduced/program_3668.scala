package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: Byte, c: Byte) extends T_A[T_A[(T_B,Byte), (T_B,Boolean)], C]
case class CC_B[D](a: T_A[D, D]) extends T_A[T_A[(T_B,Byte), (T_B,Boolean)], D]
case class CC_C(a: Boolean) extends T_B
case class CC_D(a: T_B, b: CC_C, c: Int) extends T_B
case class CC_E(a: CC_B[(CC_C,CC_D)]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_E(CC_B(_)) => 1 
}
}
// This is not matched: CC_D(_, _, _)