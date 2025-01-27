package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[Byte]
case class CC_B(a: CC_A, b: T_A[(CC_A,CC_A)], c: T_A[T_A[Byte]]) extends T_A[Byte]
case class CC_C[E, D](a: T_B[D, E], b: T_A[Byte]) extends T_B[D, E]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}