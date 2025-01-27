package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E) extends T_A[T_A[E, T_A[E, E]], E]
case class CC_B[F](a: F, b: F, c: F) extends T_A[T_A[F, T_A[F, F]], F]
case class CC_C[G](a: Byte, b: T_B[G, G], c: Char) extends T_A[T_A[G, T_A[G, G]], G]
case class CC_D[H](a: H) extends T_B[(T_B[Char, Boolean],T_A[Byte, (Byte,Char)]), H]

val v_a: T_A[T_A[Boolean, T_A[Boolean, Boolean]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(true) => 0 
  case CC_A(false) => 1 
  case CC_B(true, _, _) => 2 
  case CC_B(false, _, _) => 3 
  case CC_C(_, _, 'x') => 4 
  case CC_C(_, _, _) => 5 
}
}