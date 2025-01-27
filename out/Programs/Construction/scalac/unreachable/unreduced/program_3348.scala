package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[C, T_A[Byte, C]], C]
case class CC_B[D](a: CC_A[D], b: T_A[D, D]) extends T_A[T_A[D, T_A[Byte, D]], D]

val v_a: T_A[T_A[Int, T_A[Byte, Int]], Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _) => 1 
}
}