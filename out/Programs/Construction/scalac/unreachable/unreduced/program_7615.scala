package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[Byte, Byte], Byte], C]
case class CC_B[D](a: T_A[D, D], b: T_A[D, CC_A[D]]) extends T_A[T_A[T_A[Byte, Byte], Byte], D]

val v_a: T_A[T_A[T_A[Byte, Byte], Byte], Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}