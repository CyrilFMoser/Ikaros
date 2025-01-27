package Program_22 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[Byte, T_A]) extends T_A
case class CC_C[C](a: Int, b: C) extends T_B[T_A, C]
case class CC_D[D](a: D, b: Int, c: CC_C[D]) extends T_B[T_B[T_A, CC_C[T_A]], D]
case class CC_E[E](a: Boolean) extends T_B[T_B[T_A, CC_C[T_A]], E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}