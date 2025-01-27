package Program_13 

package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E]() extends T_A[D]
case class CC_B[G, F](a: T_A[G]) extends T_B[G, F]
case class CC_C[I, H](a: T_A[I], b: I, c: T_B[H, I]) extends T_B[H, I]

val v_a: T_B[Char, Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
  case CC_C(_, 'x', _) => 1 
  case CC_C(CC_A(), _, CC_C(_, _, _)) => 2 
  case CC_C(CC_A(), 'x', _) => 3 
  case CC_C(CC_A(), 'x', CC_C(_, _, _)) => 4 
  case CC_C(CC_A(), _, _) => 5 
  case CC_C(_, 'x', CC_B(_)) => 6 
}
}
// This is not matched: (CC_B Char Char (CC_A Char Boolean (T_A Char)) (T_B Char Char))
// This is not matched: (CC_C Boolean
//      Wildcard
//      (Tuple Char Wildcard)
//      (CC_A Boolean (T_A Boolean))
//      (T_B Boolean))