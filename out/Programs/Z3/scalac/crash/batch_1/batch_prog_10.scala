package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[B]) extends T_A[B]
case class CC_B[C](a: CC_A[C], b: (Int,Byte), c: T_A[C]) extends T_A[C]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(CC_A(_, _), _) => 1 
  case CC_B(_, (_,0), CC_A(_, _)) => 2 
  case CC_B(CC_A(_, _), (12,_), CC_A(_, _)) => 3 
  case CC_B(CC_A(_, _), (_,_), CC_B(_, _, _)) => 4 
  case CC_B(CC_A(_, _), _, _) => 5 
  case CC_B(CC_A(_, _), (12,_), CC_B(_, _, _)) => 6 
  case CC_B(CC_A(_, _), (12,0), _) => 7 
  case CC_B(_, (_,_), CC_B(_, _, _)) => 8 
  case CC_B(_, (_,_), CC_A(_, _)) => 9 
  case CC_B(CC_A(_, _), (12,_), _) => 10 
  case CC_B(CC_A(_, _), _, CC_B(_, _, _)) => 11 
  case CC_B(_, (12,0), CC_B(_, _, _)) => 12 
  case CC_B(CC_A(_, _), (_,_), _) => 13 
  case CC_B(_, (12,_), CC_A(_, _)) => 14 
  case CC_B(_, _, _) => 15 
  case CC_B(_, (12,0), CC_A(_, _)) => 16 
  case CC_B(_, (12,_), _) => 17 
}
}
// This is not matched: (CC_A Char
//      (CC_B Char Wildcard Wildcard Wildcard (T_A Char))
//      (CC_B Char
//            Wildcard
//            Wildcard
//            (CC_B Char Wildcard Wildcard Wildcard (T_A Char))
//            (T_A Char))
//      (T_A Char))