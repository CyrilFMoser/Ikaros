package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[T_B, Byte]) extends T_A[T_A[(T_B,Byte), T_A[T_B, T_B]], T_A[T_B, T_B]]
case class CC_B() extends T_A[T_A[(T_B,Byte), T_A[T_B, T_B]], T_A[T_B, T_B]]
case class CC_C(a: T_A[Byte, CC_B], b: T_B, c: T_A[T_B, CC_A]) extends T_B
case class CC_D(a: CC_C, b: CC_B, c: Boolean) extends T_B

val v_a: T_A[T_A[(T_B,Byte), T_A[T_B, T_B]], T_A[T_B, T_B]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}