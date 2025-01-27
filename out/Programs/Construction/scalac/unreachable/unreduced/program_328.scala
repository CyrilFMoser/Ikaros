package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Boolean]], b: Byte, c: Boolean) extends T_A[T_A[T_B[Byte]]]
case class CC_B() extends T_A[T_A[T_B[Byte]]]
case class CC_C() extends T_A[T_A[T_B[Byte]]]
case class CC_D[C, D]() extends T_B[C]
case class CC_E[E](a: T_B[E], b: T_A[E]) extends T_B[E]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_, _) => 1 
}
}