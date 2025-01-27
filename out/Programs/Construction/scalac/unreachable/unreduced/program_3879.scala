package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: T_B[E, E], b: Char) extends T_A[D]
case class CC_B[F](a: T_A[F]) extends T_A[F]
case class CC_C[G](a: Char, b: T_B[G, G]) extends T_A[G]
case class CC_D[H]() extends T_B[CC_A[T_A[Boolean], CC_B[(Char,Byte)]], H]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C('x', _) => 2 
  case CC_C(_, _) => 3 
}
}