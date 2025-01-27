package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[(T_A[Byte, Char],(Byte,Int)), C]
case class CC_B[D](a: Char) extends T_A[(T_A[Byte, Char],(Byte,Int)), D]
case class CC_C[E](a: E) extends T_A[T_A[E, E], E]

val v_a: T_A[(T_A[Byte, Char],(Byte,Int)), Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}