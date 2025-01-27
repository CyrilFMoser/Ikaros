package Program_30 

package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: Int, c: T_A[C]) extends T_A[C]
case class CC_B[D](a: (Int,(Byte,Int)), b: CC_A[D], c: CC_A[D]) extends T_A[T_A[(Int,Int)]]
case class CC_C[E]() extends T_B[E]

val v_a: T_A[T_A[(Int,Int)]] = null
val v_b: Int = v_a match{
  case CC_B((12,(_,_)), CC_A(_, _, _), CC_A(_, _, _)) => 0 
  case CC_B((12,(_,_)), _, CC_A(_, _, _)) => 1 
  case CC_B((_,(_,_)), _, CC_A(_, _, _)) => 2 
  case CC_B(_, CC_A(_, _, _), _) => 3 
  case CC_B((12,(_,_)), _, _) => 4 
  case CC_B(_, _, _) => 5 
  case CC_A(CC_A(_, _, _), 12, _) => 6 
  case CC_A(CC_B(_, _, _), _, CC_B(_, _, _)) => 7 
  case CC_A(_, _, _) => 8 
  case CC_A(CC_B(_, _, _), _, _) => 9 
}
}
// This is not matched: (CC_B (T_A Boolean) Wildcard Wildcard Wildcard (T_A (T_A (Tuple Int Int))))
// This is not matched: (CC_B Boolean Wildcard Wildcard Wildcard (T_A (T_A (Tuple Int Int))))