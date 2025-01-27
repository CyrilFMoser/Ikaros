package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[(Byte,Int), (Char,Int)]) extends T_A[Byte, C]
case class CC_B[D](a: D) extends T_A[Byte, D]
case class CC_C[E](a: T_A[Byte, E]) extends T_A[Byte, E]

val v_a: T_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C(_) => 2 
}
}