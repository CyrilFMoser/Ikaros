package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: T_A[D, D]) extends T_A[D, T_B[D]]
case class CC_B[E](a: T_B[E], b: T_B[E], c: T_A[E, E]) extends T_A[E, T_B[E]]
case class CC_C[F, G](a: CC_B[G]) extends T_A[F, G]
case class CC_D() extends T_B[T_B[Byte]]
case class CC_E(a: T_B[T_A[CC_D, CC_D]], b: (T_A[CC_D, (Boolean,Byte)],CC_D)) extends T_B[T_B[Byte]]
case class CC_F(a: T_A[CC_D, T_B[CC_D]]) extends T_B[T_B[Byte]]

val v_a: T_A[Char, T_B[Char]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_C(_)) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A(_, CC_C(CC_B(_, _, _)))