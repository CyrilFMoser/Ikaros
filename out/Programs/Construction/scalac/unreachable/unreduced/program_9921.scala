package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: Byte) extends T_A[E, Int]
case class CC_B[F](a: T_A[F, F]) extends T_A[F, Int]
case class CC_C[G]() extends T_A[G, Int]
case class CC_D[H](a: T_B[T_A[T_A[T_B[(Byte,Boolean), Boolean], Int], T_A[T_B[(Byte,Boolean), Boolean], Int]], T_A[T_B[(Byte,Boolean), Boolean], Int]], b: T_B[T_A[H, H], H]) extends T_B[T_A[H, H], H]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _)) => 1 
  case CC_B(CC_B(CC_A(_, _))) => 2 
  case CC_B(CC_B(CC_B(_))) => 3 
  case CC_B(CC_C()) => 4 
  case CC_C() => 5 
}
}
// This is not matched: CC_B(CC_B(CC_C()))