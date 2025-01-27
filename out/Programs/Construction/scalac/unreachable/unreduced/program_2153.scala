package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int, b: T_A[C, C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_A[T_A[T_A[D, D], T_A[D, D]], T_A[D, D]]) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(12, _) => 0 
  case CC_A(_, _) => 1 
  case CC_B(CC_A(_, _)) => 2 
  case CC_B(CC_B(CC_A(_, _))) => 3 
  case CC_B(CC_B(CC_B(_))) => 4 
}
}