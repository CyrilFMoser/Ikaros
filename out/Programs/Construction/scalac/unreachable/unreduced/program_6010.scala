package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[T_A[Int, Byte], T_A[Byte, Int]], C]
case class CC_B[D](a: D) extends T_A[T_A[T_A[Int, Byte], T_A[Byte, Int]], D]
case class CC_C[E]() extends T_A[T_A[T_A[Int, Byte], T_A[Byte, Int]], E]

val v_a: T_A[T_A[T_A[Int, Byte], T_A[Byte, Int]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}