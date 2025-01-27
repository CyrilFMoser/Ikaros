package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: (T_A[Byte, Char],(Char,Boolean)), c: D) extends T_A[D, T_B[D]]
case class CC_B(a: CC_A[T_A[Boolean, Int]], b: T_B[Boolean], c: T_A[T_B[Int], T_B[Boolean]]) extends T_A[T_A[Byte, T_B[Byte]], T_B[T_A[Byte, T_B[Byte]]]]
case class CC_C[E]() extends T_A[E, CC_A[E]]
case class CC_D[F](a: CC_B, b: CC_C[F]) extends T_B[F]
case class CC_E[G, H]() extends T_B[G]
case class CC_F[I](a: CC_D[I]) extends T_B[I]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(_, _, _), CC_C()) => 0 
  case CC_E() => 1 
  case CC_F(CC_D(_, _)) => 2 
}
}