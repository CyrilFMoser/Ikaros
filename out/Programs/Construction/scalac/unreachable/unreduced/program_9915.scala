package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: (T_A[(Boolean,Char), Char],T_A[T_B, T_B]), b: T_A[C, C]) extends T_A[T_A[T_A[Byte, T_B], Int], C]
case class CC_B(a: T_A[(T_B,T_B), T_A[(Int,Boolean), T_B]]) extends T_B
case class CC_C() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C() => 1 
}
}