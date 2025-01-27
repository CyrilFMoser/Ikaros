package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_A[T_B[Byte, Char], T_A[Byte, Char]]]
case class CC_B[F](a: T_B[F, F]) extends T_A[F, T_A[T_B[Byte, Char], T_A[Byte, Char]]]
case class CC_C[G](a: CC_A[G]) extends T_A[G, T_A[T_B[Byte, Char], T_A[Byte, Char]]]
case class CC_D[H]() extends T_B[T_B[Boolean, CC_B[Char]], H]

val v_a: T_A[Boolean, T_A[T_B[Byte, Char], T_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(CC_A()) => 2 
}
}