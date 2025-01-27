package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_B, C]
case class CC_B(a: (Int,T_A[T_B, Int]), b: T_A[T_A[T_B, (Boolean,Char)], (T_B,T_B)], c: CC_A[Boolean]) extends T_B
case class CC_C(a: T_A[T_B, T_A[CC_B, T_B]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B((_,CC_A()), _, _) => 0 
  case CC_C(CC_A()) => 1 
}
}