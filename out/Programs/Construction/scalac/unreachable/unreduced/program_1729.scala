package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[T_A[Byte, Char], Boolean]]
case class CC_B[D](a: D, b: CC_A[D], c: D) extends T_A[D, T_A[T_A[Byte, Char], Boolean]]

val v_a: T_A[Int, T_A[T_A[Byte, Char], Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}