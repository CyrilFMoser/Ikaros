package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Byte, b: D, c: D) extends T_A[D]
case class CC_B[E](a: E, b: T_A[E], c: T_B[E, E]) extends T_A[E]
case class CC_C(a: T_A[CC_A[Byte]], b: T_A[Boolean]) extends T_A[Boolean]
case class CC_D[F](a: CC_A[F], b: CC_A[F]) extends T_B[F, (T_A[Char],T_A[Int])]
case class CC_E[G](a: (T_B[Int, Char],CC_C), b: (T_A[CC_C],CC_D[(Char,Int)]), c: Byte) extends T_B[G, (T_A[Char],T_A[Int])]
case class CC_F[H](a: CC_A[H]) extends T_B[H, (T_A[Char],T_A[Int])]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, 0) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B(_, _, _) => 2 
}
}