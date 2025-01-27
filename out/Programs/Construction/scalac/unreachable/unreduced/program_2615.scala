package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Char, b: Int, c: T_A[D]) extends T_A[D]
case class CC_B[E](a: T_B[E, E], b: CC_A[E], c: Char) extends T_B[E, T_A[E]]
case class CC_C[F, G]() extends T_B[F, T_A[F]]
case class CC_D[H](a: Byte) extends T_B[H, T_A[H]]

val v_a: T_B[Byte, T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C() => 1 
  case CC_D(_) => 2 
}
}