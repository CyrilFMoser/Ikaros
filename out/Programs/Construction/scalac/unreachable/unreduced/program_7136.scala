package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: (T_A[Boolean, (Boolean,Byte)],T_A[Int, Byte]), b: T_A[E, E]) extends T_A[T_B[T_A[Char, Char], T_B[Byte, Boolean]], E]
case class CC_B[F](a: F) extends T_A[T_B[T_A[Char, Char], T_B[Byte, Boolean]], F]
case class CC_C[H, G]() extends T_B[G, H]
case class CC_D[I, J](a: Char, b: (Byte,CC_C[(Byte,Boolean), Int])) extends T_B[J, I]
case class CC_E[L, K]() extends T_B[K, L]

val v_a: T_A[T_B[T_A[Char, Char], T_B[Byte, Boolean]], Byte] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_B(_) => 1 
}
}