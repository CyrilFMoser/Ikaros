package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_B[E], b: T_A[D, E]) extends T_A[D, E]
case class CC_B[G, F]() extends T_A[F, G]
case class CC_C[I, H]() extends T_A[H, I]
case class CC_D() extends T_B[CC_B[Byte, Int]]

val v_a: T_A[Int, CC_D] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, CC_C()) => 1 
  case CC_C() => 2 
}
}
// This is not matched: (CC_B (CC_A Wildcard (T_A Boolean)) (T_A Boolean))