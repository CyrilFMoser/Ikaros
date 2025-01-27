package Program_13 

package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E]() extends T_A[C, D]
case class CC_B[F, G](a: F, b: CC_A[F, F, F], c: Char) extends T_A[F, G]
case class CC_C[H](a: CC_B[H, H], b: T_A[H, Int], c: T_A[H, H]) extends T_A[CC_A[(Char,Char), H, H], H]

val v_a: T_A[CC_A[(Char,Char), Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A(), _) => 1 
  case CC_B(_, CC_A(), 'x') => 2 
  case CC_B(CC_A(), CC_A(), _) => 3 
  case CC_B(_, _, 'x') => 4 
  case CC_C(CC_B(_, _, _), CC_B(_, _, _), CC_B(_, _, _)) => 5 
  case CC_C(_, CC_A(), CC_B(_, _, _)) => 6 
  case CC_C(CC_B(_, _, _), CC_B(_, _, _), _) => 7 
  case CC_C(_, CC_B(_, _, _), CC_B(_, _, _)) => 8 
  case CC_C(CC_B(_, _, _), _, CC_B(_, _, _)) => 9 
  case CC_C(CC_B(_, _, _), CC_A(), CC_B(_, _, _)) => 10 
  case CC_C(CC_B(_, _, _), CC_A(), CC_A()) => 11 
  case CC_C(_, CC_A(), _) => 12 
  case CC_C(CC_B(_, _, _), _, _) => 13 
  case CC_C(_, CC_B(_, _, _), CC_A()) => 14 
  case CC_C(_, _, CC_B(_, _, _)) => 15 
}
}
// This is not matched: (CC_A Int
//      (CC_A (Tuple Char Char) Int Int (T_A Boolean Boolean))
//      Boolean
//      (T_A (CC_A (Tuple Char Char) Int Int (T_A Boolean Boolean)) Int))
// This is not matched: (CC_C Wildcard Wildcard (T_A Boolean))