package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[D, T_B[T_B[Boolean]]]
case class CC_B[E](a: E, b: (Byte,(Char,Byte)), c: CC_A[E]) extends T_A[E, T_B[T_B[Boolean]]]
case class CC_C[F](a: T_A[F, F], b: F) extends T_A[F, T_B[T_B[Boolean]]]
case class CC_D(a: CC_B[(Char,Byte)], b: CC_C[CC_A[Boolean]], c: CC_B[Char]) extends T_B[T_B[T_B[Char]]]
case class CC_E[G]() extends T_B[G]
case class CC_F(a: T_B[T_B[CC_D]]) extends T_B[T_B[T_B[Char]]]

val v_a: T_B[T_B[T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(_, _, _), CC_C(_, _), CC_B(_, _, _)) => 0 
  case CC_E() => 1 
  case CC_F(CC_E()) => 2 
}
}