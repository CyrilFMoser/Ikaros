package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[(Boolean,T_A[Int])]
case class CC_B(a: CC_A) extends T_A[(Boolean,T_A[Int])]
case class CC_C[D, E](a: (T_B[CC_B, Int],CC_A)) extends T_B[D, E]
case class CC_D[F]() extends T_B[T_B[F, F], F]
case class CC_E[G](a: T_A[G]) extends T_B[T_B[G, G], G]

val v_a: T_B[T_B[CC_A, CC_A], CC_A] = null
val v_b: Int = v_a match{
  case CC_C((CC_C(_),CC_A())) => 0 
  case CC_D() => 1 
  case CC_E(_) => 2 
}
}