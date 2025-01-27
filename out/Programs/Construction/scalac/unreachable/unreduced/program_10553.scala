package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: C) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: CC_A[D], b: CC_A[CC_A[D]], c: T_A[CC_A[T_A[Char, Byte]], T_A[CC_A[T_A[Char, Byte]], CC_A[T_A[Char, Byte]]]]) extends T_A[D, T_A[D, D]]
case class CC_C[F](a: CC_A[F]) extends T_A[F, CC_A[F]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _), CC_A(_, _), CC_A(CC_A(_, _), CC_A(_, _))) => 1 
  case CC_B(CC_A(_, _), CC_A(_, _), CC_A(CC_B(_, _, _), CC_A(_, _))) => 2 
}
}
// This is not matched: CC_B(CC_A(_, _), CC_A(_, _), CC_B(_, _, _))