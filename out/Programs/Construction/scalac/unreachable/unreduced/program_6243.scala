package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F](a: Boolean, b: F) extends T_A[F]
case class CC_D[G](a: Char, b: Int, c: Boolean) extends T_B[G, T_B[G, G]]
case class CC_E[H]() extends T_B[(Byte,Int), T_B[(Byte,Int), (Byte,Int)]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(true, _) => 1 
  case CC_C(false, _) => 2 
}
}
// This is not matched: CC_B()