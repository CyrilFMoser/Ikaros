package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_B[E, F], b: T_A[E, F]) extends T_A[E, F]
case class CC_B[H, G]() extends T_A[G, H]
case class CC_C[I]() extends T_B[I, T_A[I, I]]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_D(_, _, CC_A())