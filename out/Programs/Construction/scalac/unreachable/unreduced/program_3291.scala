package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: Int, b: T_B[E]) extends T_A[D, E]
case class CC_B[F, G](a: T_A[G, G], b: G, c: T_A[G, F]) extends T_A[G, F]
case class CC_C[H](a: H) extends T_A[H, (T_A[(Boolean,Char), Char],Int)]
case class CC_D[I]() extends T_B[T_A[T_B[Byte], Char]]
case class CC_E(a: Byte) extends T_B[T_A[T_B[Byte], Char]]
case class CC_F(a: CC_A[CC_B[CC_E, CC_E], T_A[CC_E, CC_E]], b: CC_E) extends T_B[T_A[T_B[Byte], Char]]

val v_a: T_A[Char, Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), _, CC_A(_, _)) => 0 
  case CC_B(CC_B(_, _, _), _, CC_A(_, _)) => 1 
  case CC_B(CC_A(_, _), _, CC_B(CC_A(_, _), _, CC_A(_, _))) => 2 
  case CC_B(CC_B(_, _, _), _, CC_B(CC_A(_, _), _, CC_A(_, _))) => 3 
  case CC_B(CC_A(_, _), _, CC_B(CC_B(_, _, _), _, CC_A(_, _))) => 4 
  case CC_B(CC_B(_, _, _), _, CC_B(CC_B(_, _, _), _, CC_A(_, _))) => 5 
  case CC_B(CC_A(_, _), _, CC_B(CC_A(_, _), _, CC_B(_, _, _))) => 6 
  case CC_B(CC_B(_, _, _), _, CC_B(CC_A(_, _), _, CC_B(_, _, _))) => 7 
  case CC_B(CC_A(_, _), _, CC_B(CC_B(_, _, _), _, CC_B(_, _, _))) => 8 
  case CC_B(CC_B(_, _, _), _, CC_B(CC_B(_, _, _), _, CC_B(_, _, _))) => 9 
}
}
// This is not matched: CC_A(_, _)