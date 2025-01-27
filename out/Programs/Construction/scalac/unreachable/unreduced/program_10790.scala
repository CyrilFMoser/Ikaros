package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, T_B], b: T_A[C, C], c: T_A[C, C]) extends T_A[C, T_B]
case class CC_B(a: (CC_A[T_B],T_A[T_B, T_B]), b: CC_A[Byte], c: T_A[T_A[Byte, T_B], T_B]) extends T_B
case class CC_C(a: T_A[(CC_B,T_B), T_B], b: Int, c: CC_A[CC_B]) extends T_B
case class CC_D[D]() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B((CC_A(_, _, _),CC_A(_, _, _)), _, _) => 0 
  case CC_C(CC_A(CC_A(_, _, _), _, _), _, _) => 1 
  case CC_D() => 2 
}
}