package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: (T_B[Char, Char],(Byte,Boolean))) extends T_A[D]
case class CC_B[E](a: Boolean) extends T_A[E]
case class CC_C[F](a: T_B[F, F], b: T_A[F]) extends T_A[F]
case class CC_D[G, H](a: Char) extends T_B[CC_A[(Boolean,Boolean)], G]
case class CC_E[I]() extends T_B[CC_A[(Boolean,Boolean)], I]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C(_, CC_B(_)) => 2 
  case CC_C(_, CC_C(_, _)) => 3 
}
}
// This is not matched: CC_C(_, CC_A((_,_)))