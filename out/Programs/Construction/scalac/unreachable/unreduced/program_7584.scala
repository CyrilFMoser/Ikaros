package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Int, b: C, c: T_B[C]) extends T_A[C]
case class CC_B[D](a: CC_A[CC_A[D]], b: D, c: T_A[D]) extends T_A[D]
case class CC_C[E](a: E) extends T_A[E]
case class CC_D(a: CC_C[T_B[Int]], b: Boolean) extends T_B[Byte]
case class CC_E[F](a: T_B[F], b: CC_C[F], c: CC_D) extends T_B[Byte]
case class CC_F(a: (T_A[Int],((Boolean,Byte),CC_D)), b: T_A[((Char,Char),CC_D)]) extends T_B[Byte]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(true) => 1 
  case CC_C(false) => 2 
}
}
// This is not matched: CC_B(_, _, _)