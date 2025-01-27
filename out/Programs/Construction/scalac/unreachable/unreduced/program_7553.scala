package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: Boolean, c: C) extends T_A[T_B, C]
case class CC_B[D]() extends T_A[T_B, D]
case class CC_C(a: T_A[T_B, T_A[T_B, T_B]], b: CC_B[T_A[T_B, T_B]]) extends T_B
case class CC_D(a: Char, b: CC_C, c: T_A[T_B, Byte]) extends T_B

val v_a: T_A[T_B, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, true, _) => 0 
  case CC_A(_, false, _) => 1 
  case CC_B() => 2 
}
}