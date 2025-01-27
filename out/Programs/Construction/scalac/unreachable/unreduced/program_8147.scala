package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: ((T_B,T_B),T_A[T_B, T_B]), b: T_A[(T_B,T_B), T_A[Char, T_B]]) extends T_A[T_A[T_A[T_B, T_B], T_B], (Boolean,T_B)]
case class CC_B(a: T_B, b: T_A[(T_B,(Char,Boolean)), CC_A], c: Boolean) extends T_B
case class CC_C(a: CC_B) extends T_B
case class CC_D(a: Int, b: (Byte,CC_B), c: (T_B,T_B)) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_D(_, _, _) => 1 
}
}
// This is not matched: CC_C(CC_B(_, _, _))