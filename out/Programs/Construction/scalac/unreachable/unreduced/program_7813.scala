package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[(T_B,T_A[T_B, T_B]), T_B]
case class CC_B() extends T_A[(T_B,T_A[T_B, T_B]), T_B]
case class CC_C() extends T_B
case class CC_D(a: (CC_C,CC_B), b: CC_B, c: T_A[T_A[CC_B, T_B], T_A[T_B, CC_C]]) extends T_B
case class CC_E(a: CC_D, b: CC_D, c: T_A[(Char,(Boolean,Byte)), CC_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_E(_, _, _) => 1 
}
}
// This is not matched: CC_D((CC_C(),CC_B()), _, _)