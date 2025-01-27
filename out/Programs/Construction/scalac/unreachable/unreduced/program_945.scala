package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: D, b: T_A[C, D], c: D) extends T_A[C, T_A[C, T_A[C, C]]]
case class CC_B[E](a: T_A[E, T_A[E, E]]) extends T_A[E, T_A[E, T_A[E, E]]]
case class CC_C[F](a: (CC_B[Char],Char), b: F) extends T_A[F, T_A[F, T_A[F, F]]]

val v_a: T_A[Byte, T_A[Byte, T_A[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _) => 2 
}
}