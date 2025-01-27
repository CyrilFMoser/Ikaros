package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[T_B[Byte]]]
case class CC_B(a: CC_A, b: CC_A) extends T_A[T_B[T_B[Byte]]]
case class CC_C[C, D]() extends T_B[C]
case class CC_D[E](a: E, b: E, c: T_A[E]) extends T_B[E]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _, _) => 1 
}
}