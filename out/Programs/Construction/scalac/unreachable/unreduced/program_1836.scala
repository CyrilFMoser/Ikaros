package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_B[T_A[Int, Boolean]]]
case class CC_B[E]() extends T_A[E, T_B[T_A[Int, Boolean]]]
case class CC_C[F](a: T_A[F, F], b: Byte, c: F) extends T_A[F, T_B[T_A[Int, Boolean]]]
case class CC_D[G]() extends T_B[G]
case class CC_E[H]() extends T_B[H]
case class CC_F[I](a: I, b: Char) extends T_B[I]

val v_a: T_A[Byte, T_B[T_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B()