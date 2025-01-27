package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: Char, c: T_A[D, D]) extends T_A[(T_B[Int],T_A[Int, Char]), D]
case class CC_B[E](a: T_A[E, E]) extends T_A[(T_B[Int],T_A[Int, Char]), E]
case class CC_C[F, G](a: T_B[F], b: F) extends T_A[(T_B[Int],T_A[Int, Char]), F]
case class CC_D[H](a: Byte, b: (T_B[Char],T_B[(Int,Int)])) extends T_B[H]

val v_a: T_A[(T_B[Int],T_A[Int, Char]), Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(CC_D(_, _), 12) => 1 
  case CC_C(CC_D(_, _), _) => 2 
}
}
// This is not matched: CC_B(_)