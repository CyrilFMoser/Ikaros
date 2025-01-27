package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[Byte, Int], (Int,Byte)], C]
case class CC_B[D](a: D, b: CC_A[D], c: T_A[D, D]) extends T_A[T_A[T_A[Byte, Int], (Int,Byte)], D]

val v_a: T_A[T_A[T_A[Byte, Int], (Int,Byte)], Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}