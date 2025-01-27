package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, T_A[T_A[Byte, Byte], Boolean]]
case class CC_B[D](a: Char, b: T_A[D, D], c: CC_A[D]) extends T_A[D, T_A[T_A[Byte, Byte], Boolean]]

val v_a: T_A[Int, T_A[T_A[Byte, Byte], Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, CC_A(_)) => 1 
}
}