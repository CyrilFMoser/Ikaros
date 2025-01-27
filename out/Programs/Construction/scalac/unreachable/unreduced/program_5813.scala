package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: T_B[D, D], c: D) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F](a: T_A[F]) extends T_A[F]
case class CC_D[G](a: G, b: T_A[G]) extends T_B[G, Char]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B()