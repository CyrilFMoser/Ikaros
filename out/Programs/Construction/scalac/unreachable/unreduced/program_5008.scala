package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: T_A[D, E]) extends T_A[E, D]
case class CC_B[F](a: T_B[F], b: T_A[F, F], c: CC_A[F, F]) extends T_A[T_B[(Int,Int)], F]
case class CC_C(a: CC_A[CC_A[Byte, (Char,Boolean)], (Char,Boolean)], b: Char, c: T_A[(Byte,Char), T_A[Boolean, Byte]]) extends T_B[T_B[Int]]
case class CC_D() extends T_B[T_B[Int]]
case class CC_E(a: CC_A[Int, Char], b: Boolean, c: CC_B[CC_A[Int, CC_C]]) extends T_B[T_B[Int]]

val v_a: T_A[T_B[(Int,Int)], CC_D] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_B(_, CC_A(CC_A(_)), CC_A(CC_A(_))) => 1 
}
}