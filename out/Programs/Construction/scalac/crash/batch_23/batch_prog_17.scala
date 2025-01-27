package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: E) extends T_A[E, F]
case class CC_B[G](a: T_B[G, G], b: T_B[G, G], c: CC_A[CC_A[G, Byte], G]) extends T_A[G, CC_A[G, G]]

val v_a: CC_A[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}