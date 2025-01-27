package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: (T_A[Int, Char],T_A[Boolean, Byte]), b: Boolean, c: T_A[F, F]) extends T_A[T_B[T_A[Char, (Byte,Byte)], T_B[Byte, Boolean]], E]
case class CC_B[G, H]() extends T_A[T_B[T_A[Char, (Byte,Byte)], T_B[Byte, Boolean]], G]
case class CC_C[I, J](a: I, b: CC_B[J, I]) extends T_B[J, I]
case class CC_D[K](a: Boolean, b: K) extends T_B[K, T_B[K, K]]

val v_a: T_A[T_B[T_A[Char, (Byte,Byte)], T_B[Byte, Boolean]], Char] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, _) => 0 
  case CC_B() => 1 
}
}