package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[(Byte,Int)]) extends T_A[T_B[T_A[Byte], (Char,Boolean)]]
case class CC_B(a: Byte) extends T_A[T_B[T_A[Byte], (Char,Boolean)]]
case class CC_C[E, D, F]() extends T_B[D, E]

val v_a: T_A[T_B[T_A[Byte], (Char,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}