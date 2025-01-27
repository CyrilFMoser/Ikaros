package Program_63 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_B[E, E]]
case class CC_B[F](a: T_B[F, F], b: T_A[F, T_B[F, F]]) extends T_A[F, T_B[F, F]]
case class CC_D[H]() extends T_B[H, (T_B[(Boolean,Boolean), Boolean],T_B[Byte, Char])]

val v_a: T_A[Byte, T_B[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_B(_, _)) => 1 
}
}
// This is not matched: CC_A((_,CC_B(_)), _, _)