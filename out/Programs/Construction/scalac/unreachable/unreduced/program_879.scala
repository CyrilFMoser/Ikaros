package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: D, b: T_B[D], c: Boolean) extends T_A[D, (T_A[Byte, Char],T_A[Boolean, Byte])]
case class CC_B[F](a: Int, b: Byte, c: CC_A[F, F]) extends T_B[F]
case class CC_C[G](a: Char, b: T_A[G, G]) extends T_B[G]
case class CC_D[H]() extends T_B[H]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D() => 1 
}
}
// This is not matched: CC_B(_, _, CC_A(_, _, _))