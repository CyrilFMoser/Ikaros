package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Byte, b: T_A[T_A[C, C], T_B]) extends T_A[T_A[T_B, T_A[T_B, T_B]], C]
case class CC_B[D]() extends T_A[T_A[T_B, T_A[T_B, T_B]], D]
case class CC_C(a: T_A[T_A[Int, T_B], T_B]) extends T_A[T_A[T_B, T_A[T_B, T_B]], Byte]
case class CC_D(a: CC_B[CC_B[T_B]], b: Int, c: Boolean) extends T_B

val v_a: T_A[T_A[T_B, T_A[T_B, T_B]], CC_C] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}