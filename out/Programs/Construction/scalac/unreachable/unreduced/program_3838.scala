package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: Char, b: T_A[F, F]) extends T_A[E, F]
case class CC_B(a: T_B[T_A[Byte, Byte], (Boolean,Byte)]) extends T_A[Char, T_A[T_A[Char, Int], Char]]
case class CC_C[G]() extends T_B[T_A[G, G], G]
case class CC_D() extends T_B[T_A[T_A[CC_B, T_A[CC_B, CC_B]], T_A[CC_B, T_A[CC_B, CC_B]]], T_A[CC_B, T_A[CC_B, CC_B]]]

val v_a: T_A[Char, T_A[T_A[Char, Int], Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_B(_) => 1 
}
}