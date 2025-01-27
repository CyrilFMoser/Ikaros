package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: C, c: T_A[C, T_A[T_B, Byte]]) extends T_A[C, T_A[T_B, Byte]]
case class CC_B[D](a: D) extends T_A[D, T_A[T_B, Byte]]
case class CC_C(a: T_A[CC_A[T_B], T_A[T_B, Byte]]) extends T_B

val v_a: T_A[Byte, T_A[T_B, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_A(_, _, CC_B(_))) => 1 
  case CC_A(_, _, CC_B(_)) => 2 
  case CC_B(_) => 3 
}
}