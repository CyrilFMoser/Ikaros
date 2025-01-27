package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_B, C]
case class CC_B[D](a: Char, b: Byte) extends T_A[T_B, D]
case class CC_C(a: Int, b: T_A[(T_B,Int), T_A[T_B, (Byte,Int)]]) extends T_B
case class CC_D[E](a: T_A[T_B, E]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(12, _) => 0 
  case CC_C(_, _) => 1 
  case CC_D(_) => 2 
}
}