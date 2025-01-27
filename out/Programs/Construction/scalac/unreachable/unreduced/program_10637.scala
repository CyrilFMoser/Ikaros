package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: T_B[D], b: T_A[D, E]) extends T_A[D, E]
case class CC_B[F, G](a: G, b: F, c: T_A[F, F]) extends T_A[F, G]
case class CC_C[H](a: T_A[H, H]) extends T_B[Byte]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(_, CC_B(_, _, _))) => 1 
  case CC_A(_, CC_B(_, _, CC_A(_, _))) => 2 
  case CC_A(_, CC_B(_, _, CC_B(_, _, _))) => 3 
  case CC_B(_, _, CC_A(_, _)) => 4 
  case CC_B(_, _, CC_B(_, _, _)) => 5 
}
}