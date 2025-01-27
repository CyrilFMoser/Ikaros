package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: Byte, c: T_A[E, T_B[E, E]]) extends T_A[E, T_A[T_A[Char, Byte], T_A[Int, Byte]]]
case class CC_B[F]() extends T_A[F, T_A[T_A[Char, Byte], T_A[Int, Byte]]]

val v_a: T_A[Int, T_A[T_A[Char, Byte], T_A[Int, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}