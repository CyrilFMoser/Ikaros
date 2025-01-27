package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Char]], b: Boolean, c: T_A[T_A[Char]]) extends T_A[T_A[Char]]
case class CC_B(a: T_B[CC_A, T_B[Char, CC_A]]) extends T_A[T_A[Char]]
case class CC_C(a: CC_A, b: T_B[CC_A, (CC_B,Char)]) extends T_A[T_A[T_A[Char]]]
case class CC_D[D](a: T_A[T_A[Char]], b: T_A[T_A[Char]]) extends T_B[T_A[D], D]
case class CC_E[E](a: T_B[E, CC_C], b: CC_A) extends T_B[E, CC_C]
case class CC_F[F](a: CC_E[F], b: Char, c: Char) extends T_B[Boolean, F]

val v_a: T_B[T_A[CC_A], CC_A] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _, CC_A(_, _, _)), _) => 0 
  case CC_D(CC_A(_, _, CC_B(_)), _) => 1 
  case CC_D(CC_B(_), _) => 2 
}
}