package Program_30 

package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, C], b: D, c: T_A[C, D]) extends T_A[C, D]
case class CC_B[E, F, G](a: T_A[E, G], b: (Int,Boolean)) extends T_A[E, F]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 0 
  case CC_A(CC_B(_, _), _, CC_A(_, _, _)) => 1 
  case CC_A(_, 12, CC_B(_, _)) => 2 
  case CC_A(_, _, CC_A(_, _, _)) => 3 
  case CC_A(_, _, CC_B(_, _)) => 4 
  case CC_A(CC_A(_, _, _), 12, _) => 5 
  case CC_A(CC_B(_, _), 12, CC_A(_, _, _)) => 6 
  case CC_A(CC_A(_, _, _), 12, CC_B(_, _)) => 7 
  case CC_A(_, _, _) => 8 
  case CC_A(CC_B(_, _), 12, _) => 9 
  case CC_A(_, 12, CC_A(_, _, _)) => 10 
  case CC_A(CC_B(_, _), _, CC_B(_, _)) => 11 
  case CC_A(CC_A(_, _, _), _, CC_B(_, _)) => 12 
  case CC_A(CC_A(_, _, _), 12, CC_A(_, _, _)) => 13 
  case CC_A(CC_A(_, _, _), _, _) => 14 
  case CC_B(CC_A(_, _, _), (12,_)) => 15 
  case CC_B(CC_A(_, _, _), (_,_)) => 16 
  case CC_B(_, _) => 17 
  case CC_B(CC_A(_, _, _), _) => 18 
  case CC_B(CC_B(_, _), (_,_)) => 19 
  case CC_B(_, (_,_)) => 20 
}
}
// This is not matched: (CC_B Int Int Boolean Wildcard Wildcard (T_A Int Int))
// This is not matched: (CC_F Wildcard Wildcard T_B)