package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E]) extends T_A[T_A[T_A[Char, Byte], Boolean], E]
case class CC_B[F](a: T_B[F, CC_A[Char]], b: (T_A[Int, Char],Char)) extends T_B[F, CC_A[Char]]
case class CC_C[G](a: G, b: CC_A[G]) extends T_B[G, CC_A[Char]]
case class CC_D[I, H](a: Int, b: T_B[I, I]) extends T_B[I, H]

val v_a: T_B[Int, CC_A[Char]] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _), (_,_)) => 0 
  case CC_B(CC_C(_, _), (_,_)) => 1 
  case CC_B(CC_D(_, _), (_,_)) => 2 
  case CC_D(_, CC_D(_, _)) => 3 
}
}
// This is not matched: CC_C(_, _)