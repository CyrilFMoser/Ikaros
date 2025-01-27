package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_A[T_A[Byte]]]
case class CC_B[D, E](a: (T_B[Char, CC_A],CC_A), b: Char) extends T_B[E, D]
case class CC_C[F](a: T_B[Char, F], b: T_B[F, T_A[F]]) extends T_B[F, T_A[F]]
case class CC_D[H, G](a: T_A[G]) extends T_B[G, H]

val v_a: T_B[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_B((CC_B(_, _),CC_A()), 'x') => 0 
  case CC_B((CC_D(_),CC_A()), 'x') => 1 
  case CC_B((CC_B(_, _),CC_A()), _) => 2 
  case CC_B((CC_D(_),CC_A()), _) => 3 
  case CC_D(_) => 4 
}
}