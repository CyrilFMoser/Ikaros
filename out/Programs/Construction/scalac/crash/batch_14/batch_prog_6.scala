package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C](a: D, b: T_A[C, C]) extends T_A[D, C]
case class CC_B[E](a: T_B) extends T_A[T_A[T_A[T_B, T_B], T_B], E]
case class CC_C[G, F](a: T_B, b: CC_A[F, F], c: Byte) extends T_A[G, F]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(_, CC_C(_, _, _))) => 1 
  case CC_A(_, CC_C(_, CC_A(_, _), _)) => 2 
  case CC_C(_, _, _) => 3 
}
}