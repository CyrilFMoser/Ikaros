package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Byte, b: T_A[T_B, C]) extends T_A[T_B, C]
case class CC_B[D](a: T_B, b: T_A[D, D]) extends T_A[T_B, D]
case class CC_C(a: CC_B[T_A[T_B, T_B]], b: T_A[T_B, CC_B[T_B]]) extends T_B
case class CC_D(a: CC_C, b: T_A[(Int,T_B), T_A[T_B, CC_C]], c: CC_B[CC_C]) extends T_B

val v_a: T_A[T_B, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B(_, _)) => 1 
  case CC_B(_, _) => 2 
}
}