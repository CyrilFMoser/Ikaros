package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: (Int,T_B[Boolean]), b: T_B[E], c: T_A[E, T_A[D, E]]) extends T_A[D, E]
case class CC_B(a: T_B[T_A[Char, Int]], b: T_B[T_A[Byte, (Byte,Char)]], c: T_B[T_A[Char, Boolean]]) extends T_A[T_A[T_A[Byte, Boolean], T_B[Boolean]], T_A[T_A[Char, Byte], T_A[Int, Boolean]]]
case class CC_C[F](a: T_A[F, Int], b: T_A[F, F]) extends T_A[T_A[T_A[Byte, Boolean], T_B[Boolean]], T_A[T_A[Char, Byte], T_A[Int, Boolean]]]
case class CC_D(a: Byte, b: CC_A[T_A[CC_B, CC_B], (CC_B,CC_B)]) extends T_B[CC_A[CC_C[CC_B], T_A[CC_B, CC_B]]]
case class CC_E() extends T_B[((CC_D,(Boolean,Char)),CC_B)]
case class CC_F(a: CC_C[CC_D], b: CC_A[T_A[CC_D, Int], (CC_D,CC_E)], c: CC_C[CC_D]) extends T_B[((CC_D,(Boolean,Char)),CC_B)]

val v_a: T_B[((CC_D,(Boolean,Char)),CC_B)] = null
val v_b: Int = v_a match{
  case CC_E() => 0 
  case CC_F(CC_C(_, _), CC_A(_, _, _), CC_C(_, _)) => 1 
}
}