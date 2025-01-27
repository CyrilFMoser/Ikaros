package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[Byte, C]
case class CC_B[D](a: D, b: D, c: D) extends T_A[Byte, D]

val v_a: T_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, true) => 1 
  case CC_B(_, _, false) => 2 
}
}