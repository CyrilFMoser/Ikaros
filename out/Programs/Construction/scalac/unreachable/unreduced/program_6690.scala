package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[T_A[E, Char], Int], b: T_A[E, E]) extends T_A[(T_B[(Int,Int), Int],T_B[Boolean, Byte]), E]
case class CC_B[F](a: T_B[T_A[F, F], F]) extends T_A[(T_B[(Int,Int), Int],T_B[Boolean, Byte]), F]
case class CC_C[G]() extends T_A[(T_B[(Int,Int), Int],T_B[Boolean, Byte]), G]

val v_a: T_A[(T_B[(Int,Int), Int],T_B[Boolean, Byte]), Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C()