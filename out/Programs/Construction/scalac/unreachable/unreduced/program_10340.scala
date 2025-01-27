package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_B, C], b: Char) extends T_A[T_A[T_B, T_B], C]
case class CC_B[D](a: T_A[T_A[T_B, T_B], D], b: D, c: D) extends T_A[T_A[T_B, T_B], D]
case class CC_C() extends T_A[T_A[T_B, T_B], Byte]
case class CC_D[E](a: T_A[T_A[T_B, T_B], E], b: E) extends T_B
case class CC_E(a: CC_B[(Boolean,(Byte,Int))], b: T_B, c: T_A[T_B, ((Char,Int),T_B)]) extends T_B
case class CC_F(a: Char) extends T_B

val v_a: T_A[T_A[T_B, T_B], CC_F] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}