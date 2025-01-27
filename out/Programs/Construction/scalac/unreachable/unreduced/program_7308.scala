package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: E) extends T_A[T_A[T_B[Int, Byte], T_B[Byte, Char]], E]
case class CC_B() extends T_A[T_A[T_B[Int, Byte], T_B[Byte, Char]], CC_A[T_A[Byte, Char]]]
case class CC_C[G, F](a: CC_A[F], b: Int) extends T_B[F, G]

val v_a: T_A[T_A[T_B[Int, Byte], T_B[Byte, Char]], CC_A[T_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(CC_A(_, _), _), CC_A(_, _)) => 0 
  case CC_B() => 1 
}
}