package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C, c: T_A[C, C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_A[T_A[D, D], D]) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, 0, _) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B(CC_A(_, _, _)) => 2 
  case CC_B(CC_B(CC_A(_, _, _))) => 3 
  case CC_B(CC_B(CC_B(_))) => 4 
}
}