package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_A[T_A[E, E], Byte], c: E) extends T_A[E, (T_B[Int, Boolean],T_B[Byte, Int])]
case class CC_B[F](a: (T_B[Char, Byte],T_B[Int, Char]), b: CC_A[F]) extends T_A[F, (T_B[Int, Boolean],T_B[Byte, Int])]
case class CC_C[G]() extends T_A[G, (T_B[Int, Boolean],T_B[Byte, Int])]
case class CC_D() extends T_B[CC_A[CC_A[Byte]], CC_A[T_A[Int, Int]]]
case class CC_E[H](a: (CC_A[CC_D],Boolean), b: H, c: T_B[(CC_D,CC_D), H]) extends T_B[CC_A[CC_A[Byte]], CC_A[T_A[Int, Int]]]
case class CC_F[I](a: CC_C[I], b: T_A[T_A[I, I], I], c: CC_C[I]) extends T_B[CC_A[CC_A[Byte]], CC_A[T_A[Int, Int]]]

val v_a: T_A[Int, (T_B[Int, Boolean],T_B[Byte, Int])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, 12) => 0 
  case CC_A(_, _, _) => 1 
  case CC_C() => 2 
}
}
// This is not matched: CC_B((_,_), CC_A(_, _, _))