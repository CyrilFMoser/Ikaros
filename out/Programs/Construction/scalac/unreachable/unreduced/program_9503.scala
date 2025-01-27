package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_B[D]) extends T_A[D, T_A[Char, T_B[Byte]]]
case class CC_B[E](a: Char, b: CC_A[E], c: T_B[E]) extends T_A[E, T_A[Char, T_B[Byte]]]
case class CC_C[F](a: F, b: T_B[F]) extends T_A[F, T_A[Char, T_B[Byte]]]
case class CC_D[G](a: CC_B[G], b: T_B[G], c: T_B[G]) extends T_B[G]
case class CC_E() extends T_B[(Int,CC_B[Int])]

val v_a: T_A[Char, T_A[Char, T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B('x', CC_A(_, CC_D(_, _, _)), CC_D(_, CC_D(_, _, _), CC_D(_, _, _))) => 1 
  case CC_C(_, CC_D(CC_B(_, _, _), CC_D(_, _, _), CC_D(_, _, _))) => 2 
}
}
// This is not matched: CC_B(_, CC_A(_, CC_D(_, _, _)), CC_D(_, CC_D(_, _, _), CC_D(_, _, _)))