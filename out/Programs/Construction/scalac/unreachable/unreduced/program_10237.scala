package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: (T_B[Byte, (Boolean,Int)],T_A[Int]), b: E) extends T_A[E]
case class CC_C[F](a: T_A[F], b: Boolean) extends T_A[F]
case class CC_D[G]() extends T_B[G, CC_C[T_A[Int]]]
case class CC_E[H](a: H) extends T_B[H, CC_C[T_A[Int]]]
case class CC_F[I]() extends T_B[I, CC_C[T_A[Int]]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,CC_A()), _) => 1 
  case CC_B((_,CC_B(_, _)), _) => 2 
  case CC_B((_,CC_C(_, _)), _) => 3 
}
}
// This is not matched: CC_C(_, _)