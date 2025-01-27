package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[T_B[(Int,Char), E], E], b: T_A[Byte, E], c: T_B[E, T_A[E, E]]) extends T_A[Byte, E]
case class CC_B[F]() extends T_B[F, Int]
case class CC_C[G](a: CC_A[G], b: G, c: T_A[G, Byte]) extends T_B[G, Int]
case class CC_D(a: T_B[T_A[Boolean, Int], Int]) extends T_B[T_A[T_A[Byte, Boolean], T_A[Char, Boolean]], Int]

val v_a: T_B[T_A[T_A[Byte, Boolean], T_A[Char, Boolean]], Int] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, _) => 1 
  case CC_D(CC_B()) => 2 
}
}
// This is not matched: CC_D(CC_C(CC_A(_, _, _), _, _))