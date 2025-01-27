package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E]() extends T_A[F, E]
case class CC_B[G](a: Byte, b: Int, c: G) extends T_A[Byte, G]
case class CC_C[H](a: T_B[H, T_A[H, H]], b: CC_A[H, H], c: H) extends T_B[H, T_A[H, H]]
case class CC_D[I](a: T_B[I, I], b: I) extends T_B[I, T_A[I, I]]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(CC_C(_, _, _), CC_A(), _), CC_A(), _) => 0 
  case CC_C(CC_C(CC_D(_, _), CC_A(), _), CC_A(), _) => 1 
  case CC_C(CC_D(_, _), CC_A(), _) => 2 
}
}