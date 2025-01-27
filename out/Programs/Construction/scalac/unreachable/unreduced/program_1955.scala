package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: D, b: T_A[D, D], c: T_B[E]) extends T_A[E, D]
case class CC_B[F](a: T_B[F], b: T_B[CC_A[F, F]], c: Char) extends T_A[F, T_B[F]]
case class CC_C[G](a: Byte) extends T_A[G, T_B[G]]
case class CC_D() extends T_B[Char]
case class CC_E() extends T_B[Char]
case class CC_F(a: T_A[T_B[Char], CC_D], b: Byte) extends T_B[Char]

val v_a: T_A[T_B[Char], T_B[T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A(_, _, _)