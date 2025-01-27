package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[T_B, T_B], b: T_A[T_A[T_B, T_B], Byte]) extends T_A[T_A[T_B, T_B], Byte]
case class CC_B(a: CC_A, b: T_A[T_A[T_B, T_B], Byte]) extends T_B
case class CC_C(a: (CC_B,T_B), b: T_A[T_A[T_B, T_B], Byte], c: CC_A) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _)) => 0 
  case CC_C(_, _, _) => 1 
  case CC_D() => 2 
}
}