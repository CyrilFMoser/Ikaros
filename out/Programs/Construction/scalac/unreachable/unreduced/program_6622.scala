package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_B[E, E], b: T_A[F, F], c: T_A[E, E]) extends T_A[F, E]
case class CC_B[H, G](a: H, b: T_A[G, H]) extends T_A[H, G]
case class CC_C[I](a: T_A[I, I], b: T_A[I, CC_B[Byte, I]], c: Char) extends T_B[T_A[T_A[Char, Char], T_A[Char, Char]], I]
case class CC_D[J](a: T_A[J, J]) extends T_B[T_A[T_A[Char, Char], T_A[Char, Char]], J]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_B(_, _)) => 1 
  case CC_B(_, CC_A(_, CC_A(_, _, _), _)) => 2 
  case CC_B(_, CC_A(_, CC_B(_, _), _)) => 3 
  case CC_B(_, CC_B(_, _)) => 4 
}
}