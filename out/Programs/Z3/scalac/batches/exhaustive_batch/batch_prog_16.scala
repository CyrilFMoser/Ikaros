package Program_16 

 object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[F, E]
case class CC_B(a: CC_A[Boolean, Int]) extends T_A[Int, T_A[Boolean, Byte]]
case class CC_C[H, G](a: T_A[G, H]) extends T_B[G, H]
case class CC_D[I, J]() extends T_B[I, J]
case class CC_E[L, K]() extends T_B[K, L]

val v_a: T_B[Char, T_A[Int, T_A[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E() => 1 
  case CC_C(_) => 2 
  case CC_C(CC_A()) => 3 
}
}