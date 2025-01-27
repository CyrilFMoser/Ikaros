package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Byte, b: (T_B,T_A[T_B, T_B]), c: (T_B,T_B)) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: CC_A[D]) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: CC_B[E]) extends T_B

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_C(_),_), (CC_C(_),CC_C(_))) => 0 
  case CC_B(_) => 1 
}
}