package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: (T_A,T_A)) extends T_A
case class CC_B[D]() extends T_B[T_B[(T_A,T_A), D], D]
case class CC_C[E, F](a: T_A, b: T_B[E, F]) extends T_B[T_B[(T_A,T_A), E], E]
case class CC_D[G](a: T_B[T_A, G], b: CC_A[G]) extends T_B[T_B[(T_A,T_A), G], G]

val v_a: T_B[T_B[(T_A,T_A), Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _) => 1 
  case CC_D(_, _) => 2 
}
}