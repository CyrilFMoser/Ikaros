package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[T_A[D, (Byte,Byte)], D]) extends T_A[T_B[T_A[Byte, Int]], D]
case class CC_B[E](a: Char) extends T_A[T_B[T_A[Byte, Int]], E]

val v_a: T_A[T_B[T_A[Byte, Int]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}