package Program_13 

package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[Boolean, Boolean]) extends T_A[D, C]
case class CC_B[G, F](a: T_A[F, G], b: T_A[G, F], c: CC_A[F, Char, G]) extends T_A[F, G]
case class CC_C[H, I](a: T_A[H, Int]) extends T_A[H, I]

val v_a: CC_B[Int, Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_), CC_C(_), _) => 0 
  case CC_B(CC_B(_, _, _), CC_B(_, _, _), CC_A(_)) => 1 
  case CC_B(CC_B(_, _, _), CC_B(_, _, _), _) => 2 
  case CC_B(_, CC_A(_), CC_A(_)) => 3 
  case CC_B(CC_B(_, _, _), CC_A(_), CC_A(_)) => 4 
  case CC_B(CC_C(_), CC_B(_, _, _), CC_A(_)) => 5 
  case CC_B(_, CC_C(_), CC_A(_)) => 6 
  case CC_B(CC_A(_), _, CC_A(_)) => 7 
  case CC_B(CC_B(_, _, _), _, _) => 8 
  case CC_B(CC_C(_), _, _) => 9 
  case CC_B(CC_A(_), CC_B(_, _, _), CC_A(_)) => 10 
  case CC_B(CC_A(_), CC_A(_), _) => 11 
  case CC_B(CC_C(_), CC_C(_), _) => 12 
  case CC_B(CC_B(_, _, _), _, CC_A(_)) => 13 
  case CC_B(CC_A(_), CC_C(_), CC_A(_)) => 14 
  case CC_B(CC_A(_), CC_A(_), CC_A(_)) => 15 
  case CC_B(CC_C(_), CC_A(_), _) => 16 
  case CC_B(CC_B(_, _, _), CC_C(_), CC_A(_)) => 17 
  case CC_B(CC_C(_), CC_C(_), CC_A(_)) => 18 
  case CC_B(_, CC_B(_, _, _), CC_A(_)) => 19 
  case CC_B(CC_C(_), CC_B(_, _, _), _) => 20 
  case CC_B(CC_B(_, _, _), CC_C(_), _) => 21 
  case CC_B(CC_B(_, _, _), CC_A(_), _) => 22 
}
}
// This is not matched: (CC_B Int
//      Int
//      (CC_A Int
//            Int
//            Boolean
//            (CC_A Boolean Boolean Boolean Wildcard (T_A Boolean Boolean))
//            (T_A Int Int))
//      (CC_A Int Int Boolean Wildcard (T_A Int Int))
//      Wildcard
//      (T_A Int Int))
// This is not matched: (CC_B Byte Boolean Wildcard Wildcard Wildcard (T_A Byte))