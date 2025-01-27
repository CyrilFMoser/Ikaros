package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: D) extends T_A[D]
case class CC_B[E, F](a: (CC_A[(Byte,Int)],T_B[Byte, Byte]), b: T_B[E, E], c: CC_A[E]) extends T_A[E]
case class CC_C[G, H](a: Int, b: T_A[H], c: (Boolean,T_A[Byte])) extends T_A[G]
case class CC_D[I](a: T_B[(Int,Boolean), I]) extends T_B[(Int,Boolean), I]
case class CC_E[J]() extends T_B[(Int,Boolean), J]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A(_, _)) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_A(_, _)