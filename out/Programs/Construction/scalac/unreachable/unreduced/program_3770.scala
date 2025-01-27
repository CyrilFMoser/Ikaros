package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Byte, b: T_A[T_A[Char]], c: T_B[((Int,Char),Byte), Boolean]) extends T_A[T_B[Boolean, T_A[Byte]]]
case class CC_B(a: Byte, b: Char) extends T_A[T_B[Boolean, T_A[Byte]]]
case class CC_C() extends T_A[T_B[Boolean, T_A[Byte]]]
case class CC_D[D, E](a: T_B[D, E]) extends T_B[D, E]
case class CC_E[F](a: F, b: CC_B, c: F) extends T_B[CC_C, F]

val v_a: T_A[T_B[Boolean, T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_D(CC_D(_))) => 0 
  case CC_B(_, 'x') => 1 
  case CC_B(_, _) => 2 
}
}
// This is not matched: CC_C()