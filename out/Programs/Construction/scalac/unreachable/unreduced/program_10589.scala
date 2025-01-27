package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C]) extends T_A[T_B, C]
case class CC_B[D](a: D) extends T_A[T_B, D]
case class CC_C[E]() extends T_A[T_B, E]
case class CC_D() extends T_B
case class CC_E(a: CC_A[T_A[T_B, T_B]], b: T_A[T_B, CC_C[(Char,Byte)]]) extends T_B
case class CC_F(a: CC_D) extends T_B

val v_a: T_A[T_B, Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B('x') => 1 
  case CC_B(_) => 2 
  case CC_C() => 3 
}
}