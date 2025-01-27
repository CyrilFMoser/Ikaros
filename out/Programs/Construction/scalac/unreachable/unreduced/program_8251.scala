package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: D, c: T_A[D, D]) extends T_A[D, (Byte,T_B[Int])]
case class CC_B[E](a: T_A[E, E], b: Char, c: E) extends T_B[E]
case class CC_C[F, G](a: CC_A[G], b: T_A[T_B[Char], G]) extends T_B[F]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, _) => 1 
}
}