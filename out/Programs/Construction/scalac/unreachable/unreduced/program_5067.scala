package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_A[T_B, C], c: T_A[C, C]) extends T_A[T_B, C]
case class CC_B[D]() extends T_A[T_B, D]
case class CC_C(a: T_B, b: T_A[T_B, T_A[T_B, (Char,Byte)]]) extends T_B
case class CC_D() extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_, _, _)) => 0 
  case CC_C(_, CC_B()) => 1 
}
}