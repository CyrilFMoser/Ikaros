package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Boolean) extends T_A
case class CC_B[C, D](a: D, b: T_B[C, C]) extends T_B[T_B[C, C], C]
case class CC_C[E]() extends T_B[T_B[E, E], E]

val v_a: T_B[T_B[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C() => 1 
}
}