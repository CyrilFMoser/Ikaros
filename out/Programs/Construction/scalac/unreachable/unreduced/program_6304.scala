package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: E, b: T_A[E]) extends T_A[E]
case class CC_C[F](a: Char, b: T_A[F], c: CC_A[F]) extends T_B[F, CC_A[CC_B[(Char,Char)]]]
case class CC_D[G](a: T_A[G]) extends T_B[G, CC_A[CC_B[(Char,Char)]]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B('x', _) => 1 
  case CC_B(_, _) => 2 
}
}