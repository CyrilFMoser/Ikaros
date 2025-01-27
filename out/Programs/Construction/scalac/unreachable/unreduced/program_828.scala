package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_A[E, E]) extends T_A[T_A[Boolean, (Char,Char)], E]
case class CC_B[F, G]() extends T_A[F, G]
case class CC_C[H](a: Int, b: CC_B[T_A[H, H], H]) extends T_A[T_A[Boolean, (Char,Char)], H]
case class CC_D[I]() extends T_B[T_B[I, I], I]
case class CC_E(a: CC_C[CC_C[(Char,Char)]], b: T_A[Int, Boolean], c: CC_A[CC_A[Char]]) extends T_B[(CC_B[Boolean, Boolean],Byte), CC_D[T_B[Boolean, Byte]]]

val v_a: T_A[T_A[Boolean, (Char,Char)], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B()) => 0 
  case CC_B() => 1 
  case CC_C(_, CC_B()) => 2 
}
}