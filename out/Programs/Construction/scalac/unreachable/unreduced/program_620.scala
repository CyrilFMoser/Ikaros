package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: Byte, c: T_B[T_B[E, E], E]) extends T_A[E, (T_A[(Char,Boolean), Boolean],Char)]
case class CC_B[G, F](a: T_B[G, G], b: T_B[G, F]) extends T_A[F, G]
case class CC_C[H]() extends T_B[H, T_A[H, H]]
case class CC_D[I](a: T_B[I, T_A[I, I]], b: Int, c: T_B[I, T_A[I, I]]) extends T_B[I, T_A[I, I]]
case class CC_E[J](a: T_B[J, T_A[J, J]], b: T_B[J, J], c: T_B[CC_C[J], T_A[CC_C[J], CC_C[J]]]) extends T_B[J, T_A[J, J]]

val v_a: T_B[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_C(), _, _) => 1 
  case CC_D(CC_D(_, _, _), _, _) => 2 
  case CC_D(CC_E(_, _, _), _, _) => 3 
  case CC_E(CC_C(), _, CC_C()) => 4 
  case CC_E(CC_C(), _, CC_D(_, _, _)) => 5 
  case CC_E(CC_C(), _, CC_E(_, _, _)) => 6 
  case CC_E(CC_D(_, _, _), _, CC_C()) => 7 
  case CC_E(CC_D(_, _, _), _, CC_D(_, _, _)) => 8 
  case CC_E(CC_D(_, _, _), _, CC_E(_, _, _)) => 9 
  case CC_E(CC_E(_, _, _), _, CC_C()) => 10 
  case CC_E(CC_E(_, _, _), _, CC_D(_, _, _)) => 11 
  case CC_E(CC_E(_, _, _), _, CC_E(_, _, _)) => 12 
}
}