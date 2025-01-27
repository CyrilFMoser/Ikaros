package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Byte, T_B[Boolean, Char]]) extends T_A[T_B[Byte, T_B[Byte, Byte]]]
case class CC_B[D, E](a: E, b: Boolean, c: Int) extends T_B[E, D]
case class CC_C[F, G](a: G, b: T_A[G]) extends T_B[F, G]
case class CC_D[I, H]() extends T_B[I, H]

val v_a: T_B[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D() => 1 
}
}
// This is not matched: CC_B(_, _, _)