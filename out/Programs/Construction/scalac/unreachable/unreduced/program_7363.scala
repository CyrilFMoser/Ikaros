package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_A[T_A[T_A[E, E], E], E], b: T_A[F, F], c: T_A[T_A[T_B[Byte, Byte], Int], T_A[T_B[Byte, Byte], Int]]) extends T_A[F, E]
case class CC_B[I](a: CC_A[I, I], b: CC_A[I, I], c: T_A[I, I]) extends T_B[(T_B[Boolean, Char],T_A[(Char,Int), (Int,Boolean)]), I]
case class CC_C[J](a: T_A[J, J], b: T_B[CC_B[J], J], c: Int) extends T_B[(T_B[Boolean, Char],T_A[(Char,Int), (Int,Boolean)]), J]

val v_a: T_B[(T_B[Boolean, Char],T_A[(Char,Int), (Int,Boolean)]), Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_A(_, _, _), _, CC_A(_, _, _)), CC_A(_, _, CC_A(_, _, _)), CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 0 
  case CC_C(_, _, _) => 1 
}
}