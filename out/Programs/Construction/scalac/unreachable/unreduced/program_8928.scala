package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[Int, E], b: T_A[F, E], c: T_A[E, E]) extends T_A[E, F]
case class CC_B[G, H](a: H, b: H, c: CC_A[H, H]) extends T_A[G, H]
case class CC_C[I]() extends T_B[CC_B[CC_A[Boolean, Int], CC_B[Boolean, Byte]], I]
case class CC_D[J]() extends T_B[CC_B[CC_A[Boolean, Int], CC_B[Boolean, Byte]], J]
case class CC_E[K](a: CC_B[K, K], b: T_B[K, K], c: K) extends T_B[CC_B[CC_A[Boolean, Int], CC_B[Boolean, Byte]], K]

val v_a: T_B[CC_B[CC_A[Boolean, Int], CC_B[Boolean, Byte]], Int] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D() => 1 
  case CC_E(_, _, _) => 2 
}
}