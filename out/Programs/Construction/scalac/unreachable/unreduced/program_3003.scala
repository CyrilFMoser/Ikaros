package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_B[E, E]) extends T_A[(Int,(Char,Boolean)), E]
case class CC_B[F](a: T_A[F, F], b: T_B[F, F]) extends T_A[(Int,(Char,Boolean)), F]

val v_a: T_A[(Int,(Char,Boolean)), Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
}
}