package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: T_B[D], c: T_B[T_B[D]]) extends T_A[(Int,T_A[Char, Char]), D]
case class CC_B[E](a: T_B[E], b: CC_A[E], c: CC_A[E]) extends T_A[(Int,T_A[Char, Char]), E]
case class CC_C[F](a: T_A[F, F]) extends T_A[(Int,T_A[Char, Char]), F]
case class CC_D[G](a: T_B[G], b: Int, c: Char) extends T_B[G]
case class CC_E(a: T_B[(Int,(Int,Byte))], b: CC_A[CC_D[Int]], c: T_A[Char, T_A[Boolean, Char]]) extends T_B[CC_A[CC_B[Boolean]]]
case class CC_F(a: T_B[CC_C[Int]], b: CC_A[Byte], c: CC_E) extends T_B[CC_A[CC_B[Boolean]]]

val v_a: T_B[CC_A[CC_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_D(CC_D(CC_E(_, _, _), _, _), _, _) => 0 
  case CC_D(CC_D(CC_F(_, _, _), _, _), _, _) => 1 
  case CC_D(CC_E(CC_D(_, _, _), CC_A(_, _, _), _), _, _) => 2 
  case CC_D(CC_F(CC_D(_, _, _), CC_A(_, _, _), CC_E(_, _, _)), _, _) => 3 
  case CC_E(CC_D(CC_D(_, _, _), _, _), CC_A(CC_D(_, _, _), CC_D(_, _, _), _), _) => 4 
  case CC_F(_, CC_A(_, _, _), _) => 5 
}
}
// This is not matched: CC_D(CC_D(CC_D(_, _, _), _, _), _, _)