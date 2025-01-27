package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[C, T_B]
case class CC_B(a: T_A[Byte, T_B], b: CC_A[CC_A[Boolean]], c: T_A[Byte, T_B]) extends T_A[Byte, T_B]
case class CC_C[D](a: D, b: ((T_B,CC_B),T_B)) extends T_A[D, T_B]

val v_a: T_A[Byte, T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C(_, ((_,_),_))