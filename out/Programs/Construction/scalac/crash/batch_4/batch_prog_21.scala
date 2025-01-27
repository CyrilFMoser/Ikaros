package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Int) extends T_A[D]
case class CC_B[F, E](a: Boolean) extends T_B[F, E]
case class CC_C[H, G](a: CC_A[G], b: T_A[CC_A[H]], c: H) extends T_B[G, H]

val v_a: CC_C[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
}
}