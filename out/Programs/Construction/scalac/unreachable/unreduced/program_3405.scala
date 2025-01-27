package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[E, F]
case class CC_B[H, G](a: H, b: T_A[H, G], c: T_B[G, G]) extends T_A[H, G]
case class CC_C[I](a: CC_A[I, I], b: T_A[T_A[I, I], I]) extends T_A[I, T_A[I, I]]
case class CC_D[J](a: T_A[J, J], b: T_B[T_A[J, J], Boolean]) extends T_B[J, T_A[Byte, Boolean]]

val v_a: T_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A(), _) => 1 
}
}
// This is not matched: CC_B(_, CC_B(_, _, _), _)