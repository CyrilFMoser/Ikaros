package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: Int, b: T_B[T_A[Int, Byte], Char]) extends T_A[T_A[T_A[(Char,Int), Int], (Byte,Int)], T_B[Byte, (Int,Boolean)]]
case class CC_B[E]() extends T_A[CC_A, E]
case class CC_C[F, G](a: T_A[F, G]) extends T_B[G, F]
case class CC_D[I, H](a: T_B[H, H], b: T_B[H, H], c: T_A[CC_A, I]) extends T_B[I, H]
case class CC_E[J](a: CC_A, b: T_B[J, J], c: CC_D[J, J]) extends T_B[CC_C[CC_B[CC_A], CC_A], J]

val v_a: T_B[CC_C[CC_B[CC_A], CC_A], Int] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(_), CC_C(_), CC_B()) => 0 
  case CC_D(CC_D(_, _, CC_B()), CC_C(_), CC_B()) => 1 
  case CC_D(CC_C(_), CC_D(CC_C(_), _, CC_B()), CC_B()) => 2 
  case CC_D(CC_D(_, _, CC_B()), CC_D(CC_C(_), _, CC_B()), CC_B()) => 3 
  case CC_D(CC_C(_), CC_D(CC_D(_, _, _), _, CC_B()), CC_B()) => 4 
  case CC_D(CC_D(_, _, CC_B()), CC_D(CC_D(_, _, _), _, CC_B()), CC_B()) => 5 
  case CC_E(_, _, _) => 6 
}
}
// This is not matched: CC_C(_)