package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Byte, Int], T_B[Int, Int]], b: T_A[Char]) extends T_A[Char]
case class CC_B(a: T_B[T_A[Char], T_A[(Byte,Int)]]) extends T_A[Char]
case class CC_C[D, E](a: T_B[D, D], b: (T_B[CC_A, (Int,Boolean)],CC_A), c: T_A[Char]) extends T_B[D, E]
case class CC_D[F](a: F) extends T_B[T_A[Char], F]
case class CC_E[G](a: G, b: G, c: T_A[Char]) extends T_B[T_A[Char], G]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_C(_, _, _)) => 0 
  case CC_B(CC_D(_)) => 1 
  case CC_B(CC_E(_, _, _)) => 2 
}
}
// This is not matched: CC_A(_, _)