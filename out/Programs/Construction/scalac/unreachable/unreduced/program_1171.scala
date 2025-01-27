package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: Byte, b: D, c: T_A[D]) extends T_A[D]
case class CC_B[F](a: T_A[F], b: Int, c: T_B[F, T_A[Boolean]]) extends T_A[F]
case class CC_C[G](a: G, b: T_A[G], c: CC_B[G]) extends T_A[G]
case class CC_D(a: CC_C[Char], b: T_A[(Byte,Byte)]) extends T_B[T_A[T_A[Char]], T_A[T_A[Char]]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, CC_A(_, _, _), CC_B(_, _, _)) => 2 
  case CC_C(_, CC_B(_, _, _), CC_B(_, _, _)) => 3 
  case CC_C(_, CC_C(_, _, _), CC_B(_, _, _)) => 4 
}
}