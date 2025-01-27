package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[T_A[T_A[Byte, Byte], T_A[Byte, Int]], C]
case class CC_B[D](a: T_A[T_A[D, D], D]) extends T_A[T_A[T_A[Byte, Byte], T_A[Byte, Int]], D]

val v_a: T_A[T_A[T_A[Byte, Byte], T_A[Byte, Int]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}