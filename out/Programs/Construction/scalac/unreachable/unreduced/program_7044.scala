package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Int]], b: Boolean, c: T_B[Byte, (Boolean,Boolean)]) extends T_A[T_B[T_B[Char, Byte], (Boolean,Char)]]
case class CC_B(a: CC_A, b: T_B[CC_A, T_A[Boolean]], c: T_B[T_A[CC_A], Char]) extends T_A[T_B[T_B[Char, Byte], (Boolean,Char)]]
case class CC_C(a: T_A[Byte], b: Char) extends T_A[T_B[T_B[Char, Byte], (Boolean,Char)]]
case class CC_D[E, D](a: T_A[D], b: Boolean, c: Char) extends T_B[D, E]
case class CC_E[F](a: T_B[F, T_A[CC_A]]) extends T_B[F, T_A[CC_A]]

val v_a: T_A[T_B[T_B[Char, Byte], (Boolean,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C(_, _)