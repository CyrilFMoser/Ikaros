package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: (T_B,T_A[T_B, Boolean]), c: (Byte,T_A[Char, T_B])) extends T_A[C, Boolean]
case class CC_B(a: (T_B,T_A[Boolean, Boolean])) extends T_A[Boolean, Boolean]
case class CC_C[D, E]() extends T_A[D, E]
case class CC_D(a: T_A[CC_A[CC_B], Boolean], b: T_A[T_A[Boolean, Boolean], Char]) extends T_B
case class CC_E() extends T_B

val v_a: T_A[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_D(_, _),CC_A(_, _, _)), (0,CC_C())) => 0 
  case CC_A(_, (CC_D(_, _),CC_C()), (0,CC_C())) => 1 
  case CC_A(_, (CC_D(_, _),CC_C()), (_,CC_C())) => 2 
  case CC_A(_, (CC_E(),CC_A(_, _, _)), (0,CC_C())) => 3 
  case CC_A(_, (CC_E(),CC_A(_, _, _)), (_,CC_C())) => 4 
  case CC_A(_, (CC_E(),CC_C()), (0,CC_C())) => 5 
  case CC_A(_, (CC_E(),CC_C()), (_,CC_C())) => 6 
  case CC_B((CC_D(_, _),CC_A(_, _, _))) => 7 
  case CC_B((CC_D(_, _),CC_B(_))) => 8 
  case CC_B((CC_D(_, _),CC_C())) => 9 
  case CC_B((CC_E(),CC_A(_, _, _))) => 10 
  case CC_B((CC_E(),CC_B(_))) => 11 
  case CC_B((CC_E(),CC_C())) => 12 
  case CC_C() => 13 
}
}
// This is not matched: CC_A(_, (CC_D(_, _),CC_A(_, _, _)), (_,CC_C()))