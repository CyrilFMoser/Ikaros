package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[Boolean]
case class CC_B(a: Char, b: T_A[T_A[Boolean]]) extends T_A[Boolean]
case class CC_C[F, E](a: CC_A[F]) extends T_B[E, F]
case class CC_D[G](a: CC_B, b: T_B[G, T_B[Byte, G]], c: T_A[CC_B]) extends T_B[Byte, G]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}