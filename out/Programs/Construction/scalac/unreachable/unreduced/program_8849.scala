package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[T_A[Char, Char], E], b: Boolean, c: Int) extends T_A[E, F]
case class CC_B[I, H](a: T_B[I, H], b: CC_A[I, H], c: T_B[I, H]) extends T_A[I, H]
case class CC_C[J]() extends T_A[CC_B[J, J], J]
case class CC_D[K](a: Boolean, b: CC_B[K, K], c: (Byte,CC_B[(Byte,Byte), (Int,Byte)])) extends T_B[(Int,T_A[Char, Int]), K]
case class CC_E[L](a: T_A[L, L], b: T_A[L, L]) extends T_B[(Int,T_A[Char, Int]), L]

val v_a: CC_E[Char] = null
val v_b: Int = v_a match{
  case CC_E(CC_A(_, _, _), CC_A(CC_A(_, _, _), _, _)) => 0 
  case CC_E(CC_B(_, CC_A(_, _, _), _), CC_A(CC_A(_, _, _), _, _)) => 1 
  case CC_E(CC_A(_, _, _), CC_A(CC_B(_, _, _), _, _)) => 2 
  case CC_E(CC_A(_, _, _), CC_B(_, _, _)) => 3 
  case CC_E(CC_B(_, CC_A(_, _, _), _), CC_B(_, _, _)) => 4 
}
}
// This is not matched: CC_E(CC_B(_, CC_A(_, _, _), _), CC_A(CC_B(_, _, _), _, _))