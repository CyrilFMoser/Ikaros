package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[(Byte,Char)], b: T_B[T_B[Char, (Int,Int)], T_A[Byte]]) extends T_A[T_B[Int, T_B[Boolean, Char]]]
case class CC_B(a: T_A[CC_A], b: T_A[Boolean]) extends T_A[T_B[Int, T_B[Boolean, Char]]]
case class CC_C[D, E](a: E, b: D, c: CC_A) extends T_A[D]
case class CC_D[F](a: T_A[F], b: T_A[F], c: T_B[F, F]) extends T_B[CC_C[CC_B, Int], F]
case class CC_E[G](a: Char) extends T_B[CC_C[CC_B, Int], G]

val v_a: T_B[CC_C[CC_B, Int], CC_B] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_C(_, CC_B(_, _), CC_A(_, _)), _) => 0 
  case CC_E('x') => 1 
  case CC_E(_) => 2 
}
}