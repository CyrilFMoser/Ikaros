package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[C, T_A[(Char,Char), C]]
case class CC_B[D](a: D, b: CC_A[D]) extends T_A[D, T_A[(Char,Char), D]]
case class CC_C[E, F](a: Byte, b: T_A[F, F], c: CC_A[F]) extends T_A[E, T_A[(Char,Char), E]]

val v_a: T_A[Byte, T_A[(Char,Char), Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B(_, CC_A(_, _))