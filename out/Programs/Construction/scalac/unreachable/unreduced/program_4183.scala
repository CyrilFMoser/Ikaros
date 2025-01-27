package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[T_A[T_A[Int, Int], T_A[Byte, Char]], Byte]
case class CC_B(a: T_A[CC_A, Byte]) extends T_A[T_A[T_A[Int, Int], T_A[Byte, Char]], Byte]

val v_a: T_A[T_A[T_A[Int, Int], T_A[Byte, Char]], Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}