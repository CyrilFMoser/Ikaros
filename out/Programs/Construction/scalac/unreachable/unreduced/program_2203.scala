package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_B, C]
case class CC_B[D](a: T_A[T_B, D]) extends T_A[T_B, D]
case class CC_C[E](a: (Int,T_B), b: E, c: E) extends T_A[T_B, E]
case class CC_D(a: CC_C[T_A[T_B, T_B]], b: T_A[T_A[T_B, T_B], T_A[T_B, T_B]], c: T_A[T_B, Byte]) extends T_B

val v_a: T_A[T_B, Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
  case CC_B(CC_B(_)) => 1 
  case CC_B(CC_C((_,_), true, true)) => 2 
  case CC_B(CC_C((_,_), true, false)) => 3 
  case CC_B(CC_C((_,_), false, true)) => 4 
  case CC_B(CC_C((_,_), false, false)) => 5 
  case CC_C((_,CC_D(_, _, _)), _, true) => 6 
  case CC_C((_,CC_D(_, _, _)), _, false) => 7 
}
}
// This is not matched: CC_A()