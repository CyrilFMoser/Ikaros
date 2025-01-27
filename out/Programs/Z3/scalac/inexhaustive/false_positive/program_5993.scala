package Program_14 

package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[B], c: B) extends T_A[B]
case class CC_B[C, D](a: T_A[Int], b: C, c: (Byte,Boolean)) extends T_A[C]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), 'x', (0,_)) => 0 
  case CC_B(CC_A(_, _, _), _, (0,_)) => 1 
  case CC_B(_, _, (_,_)) => 2 
  case CC_B(_, 'x', (_,_)) => 3 
  case CC_B(CC_B(_, _, _), 'x', (_,_)) => 4 
  case CC_B(_, 'x', (0,_)) => 5 
  case CC_B(CC_B(_, _, _), _, _) => 6 
  case CC_B(CC_A(_, _, _), 'x', (_,_)) => 7 
  case CC_B(CC_B(_, _, _), 'x', _) => 8 
  case CC_B(CC_B(_, _, _), 'x', (0,_)) => 9 
  case CC_A(_, _, _) => 10 
  case CC_A(CC_B(_, _, _), _, _) => 11 
  case CC_A(CC_A(_, _, _), CC_B(_, _, _), 'x') => 12 
  case CC_A(CC_A(_, _, _), _, 'x') => 13 
}
}
// This is not matched: (CC_B Char
//      Boolean
//      (CC_A Int
//            Wildcard
//            (CC_B Int Boolean Wildcard Wildcard Wildcard (T_A Int))
//            Wildcard
//            (T_A Int))
//      Char
//      Wildcard
//      (T_A Char))
// This is not matched: (CC_B Char
//      Boolean
//      (CC_A Int
//            Wildcard
//            (CC_B Int Boolean Wildcard Wildcard Wildcard (T_A Int))
//            Wildcard
//            (T_A Int))
//      Char
//      Wildcard
//      (T_A Char))