package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: Char) extends T_A[CC_A[CC_A[Boolean]], T_A[Byte, (Byte,Int)]]
case class CC_C[E]() extends T_A[E, T_A[E, E]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C() => 1 
}
}