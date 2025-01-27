package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (Boolean,T_A[T_B, T_B]), b: T_B, c: T_B) extends T_A[C, T_B]
case class CC_B() extends T_A[((Byte,T_B),T_B), T_B]
case class CC_C(a: CC_B, b: Char, c: T_A[T_A[CC_B, T_B], T_A[CC_B, T_B]]) extends T_A[((Byte,T_B),T_B), T_B]

val v_a: T_A[((Byte,T_B),T_B), T_B] = null
val v_b: Int = v_a match{
  case CC_A((_,CC_A(_, _, _)), _, _) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B()