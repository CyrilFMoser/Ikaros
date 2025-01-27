package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Char, b: T_A[C, C]) extends T_A[T_B, C]
case class CC_B[D]() extends T_A[T_B, D]
case class CC_C(a: T_B, b: CC_A[Boolean]) extends T_B
case class CC_D(a: CC_B[CC_A[CC_C]]) extends T_B
case class CC_E() extends T_B

val v_a: T_A[T_B, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}