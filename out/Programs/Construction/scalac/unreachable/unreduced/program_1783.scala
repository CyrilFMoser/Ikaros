package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_B[T_B[Boolean, (Char,Char)], T_B[Int, Boolean]], E]
case class CC_B[F](a: F) extends T_B[T_A[Char, Int], F]
case class CC_C[G]() extends T_B[T_A[Char, Int], G]
case class CC_D[H](a: T_B[H, H], b: H, c: T_B[T_A[Char, Int], H]) extends T_B[T_A[Char, Int], H]

val v_a: T_B[T_A[Char, Int], Int] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C() => 1 
  case CC_D(_, _, CC_B(_)) => 2 
  case CC_D(_, _, CC_D(_, _, _)) => 3 
}
}
// This is not matched: CC_D(_, _, CC_C())