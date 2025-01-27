package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: D) extends T_A[D]
case class CC_B[E](a: T_A[E], b: Int) extends T_A[E]
case class CC_C[F, G](a: Boolean) extends T_A[F]
case class CC_D[H]() extends T_B[H, CC_B[H]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, 0) => 0 
  case CC_A(_, _) => 1 
  case CC_B(_, _) => 2 
}
}
// This is not matched: CC_C(_)