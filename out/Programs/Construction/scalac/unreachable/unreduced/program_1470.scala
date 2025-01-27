package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[T_B[T_B[Int, Byte], T_B[(Boolean,Boolean), Int]]]
case class CC_B(a: Boolean) extends T_A[T_B[T_B[Int, Byte], T_B[(Boolean,Boolean), Int]]]
case class CC_C[E](a: CC_B, b: T_B[E, E], c: E) extends T_B[CC_B, E]
case class CC_D[F](a: T_B[F, F], b: CC_C[F]) extends T_B[CC_B, F]
case class CC_E[G](a: T_B[CC_B, G], b: G, c: CC_A[G]) extends T_B[CC_B, G]

val v_a: T_B[CC_B, Byte] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_C(_, _, _)) => 0 
  case CC_E(CC_C(_, _, _), _, CC_A()) => 1 
  case CC_E(CC_D(_, _), _, CC_A()) => 2 
  case CC_E(CC_E(_, _, _), _, CC_A()) => 3 
}
}
// This is not matched: CC_C(CC_B(_), _, _)