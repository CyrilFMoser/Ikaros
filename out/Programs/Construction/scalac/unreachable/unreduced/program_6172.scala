package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Int, b: T_A[E, T_B[E, E]], c: T_A[E, Int]) extends T_A[E, Int]
case class CC_B[F](a: (T_A[Byte, Int],Char)) extends T_A[F, Int]
case class CC_C[H, G](a: T_A[G, Int], b: CC_B[H]) extends T_B[G, H]
case class CC_D[J, I](a: T_A[I, I], b: CC_A[J]) extends T_B[I, J]

val v_a: T_B[Char, Char] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B(_)) => 0 
  case CC_D(_, CC_A(_, _, CC_A(_, _, _))) => 1 
  case CC_D(_, CC_A(_, _, CC_B(_))) => 2 
}
}