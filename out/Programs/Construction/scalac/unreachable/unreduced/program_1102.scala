package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E]) extends T_A[E, T_B[T_A[Boolean, (Char,Byte)], Char]]
case class CC_B[F](a: F, b: CC_A[F], c: T_B[F, F]) extends T_A[F, T_B[T_A[Boolean, (Char,Byte)], Char]]
case class CC_C[H, G](a: H, b: CC_A[G]) extends T_B[G, H]
case class CC_D(a: CC_B[CC_A[Char]], b: (T_B[Int, Boolean],CC_B[Boolean])) extends T_B[CC_B[CC_B[Int]], (T_A[Byte, (Byte,Boolean)],Int)]

val v_a: T_A[Byte, T_B[T_A[Boolean, (Char,Byte)], Char]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(0, _, _) => 1 
}
}
// This is not matched: CC_B(_, _, _)