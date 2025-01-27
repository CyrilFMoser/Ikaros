package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]]) extends T_A[T_A[Byte, T_A[Char, Char]], C]
case class CC_B[D](a: Char, b: D) extends T_A[T_A[Byte, T_A[Char, Char]], D]

val v_a: T_A[T_A[Byte, T_A[Char, Char]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, 12) => 1 
  case CC_B(_, _) => 2 
}
}