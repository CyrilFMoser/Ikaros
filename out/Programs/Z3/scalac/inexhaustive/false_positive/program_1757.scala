package Program_31 

package Program_6 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[C], b: B, c: Int) extends T_A[B]
case class CC_B[D](a: T_A[D], b: T_A[D], c: T_A[D]) extends T_A[D]
case class CC_C[E](a: Char) extends T_A[E]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_C('x') => 1 
  case CC_A(_, _, _) => 2 
  case CC_A(CC_A(_, _, _), _, 12) => 3 
  case CC_A(_, _, 12) => 4 
  case CC_A(CC_B(_, _, _), _, _) => 5 
  case CC_A(CC_C(_), _, 12) => 6 
  case CC_A(CC_C(_), _, _) => 7 
  case CC_B(_, CC_A(_, _, _), CC_B(_, _, _)) => 8 
  case CC_B(CC_C(_), CC_A(_, _, _), _) => 9 
  case CC_B(CC_B(_, _, _), CC_C(_), CC_A(_, _, _)) => 10 
  case CC_B(CC_B(_, _, _), CC_B(_, _, _), CC_B(_, _, _)) => 11 
  case CC_B(_, CC_C(_), CC_B(_, _, _)) => 12 
  case CC_B(CC_C(_), CC_B(_, _, _), _) => 13 
  case CC_B(CC_C(_), _, _) => 14 
  case CC_B(CC_B(_, _, _), _, CC_A(_, _, _)) => 15 
  case CC_B(_, CC_C(_), _) => 16 
  case CC_B(CC_B(_, _, _), _, _) => 17 
  case CC_B(CC_B(_, _, _), _, CC_B(_, _, _)) => 18 
  case CC_B(CC_B(_, _, _), CC_A(_, _, _), CC_A(_, _, _)) => 19 
  case CC_B(_, CC_C(_), CC_A(_, _, _)) => 20 
  case CC_B(CC_C(_), CC_C(_), CC_A(_, _, _)) => 21 
  case CC_B(CC_B(_, _, _), CC_C(_), _) => 22 
  case CC_B(CC_A(_, _, _), CC_A(_, _, _), _) => 23 
  case CC_B(CC_A(_, _, _), _, CC_B(_, _, _)) => 24 
  case CC_B(CC_C(_), _, CC_B(_, _, _)) => 25 
  case CC_B(CC_B(_, _, _), CC_A(_, _, _), _) => 26 
  case CC_B(CC_B(_, _, _), CC_B(_, _, _), _) => 27 
  case CC_B(_, _, _) => 28 
  case CC_B(CC_A(_, _, _), CC_B(_, _, _), _) => 29 
  case CC_B(_, CC_B(_, _, _), CC_A(_, _, _)) => 30 
  case CC_B(CC_A(_, _, _), CC_A(_, _, _), CC_C(_)) => 31 
  case CC_B(CC_C(_), CC_A(_, _, _), CC_A(_, _, _)) => 32 
  case CC_B(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)) => 33 
}
}
// This is not matched: (CC_A Boolean
//      Char
//      (CC_A Char
//            Wildcard
//            (CC_A Wildcard Boolean Wildcard Char Wildcard (T_A Wildcard))
//            Char
//            Int
//            (T_A Char))
//      Boolean
//      Int
//      (T_A Boolean))
// This is not matched: (CC_C T_A)