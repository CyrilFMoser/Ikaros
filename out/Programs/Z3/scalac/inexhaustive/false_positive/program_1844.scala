package Program_31 

package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D, F](a: T_B[Char], b: T_A[D, D]) extends T_A[D, E]
case class CC_B[H, G]() extends T_A[H, G]
case class CC_C(a: T_B[(Int,Char)], b: Int, c: (Byte,Int)) extends T_A[CC_A[Char, Byte, Boolean], T_A[Byte, Char]]
case class CC_D[I]() extends T_B[I]

val v_a: T_A[CC_A[Char, Byte, Boolean], T_A[Byte, Char]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_D(), _, (0,12)) => 1 
  case CC_C(_, _, (_,12)) => 2 
  case CC_C(CC_D(), 12, (0,_)) => 3 
  case CC_C(CC_D(), _, (_,12)) => 4 
  case CC_C(_, 12, (_,_)) => 5 
  case CC_C(_, _, _) => 6 
  case CC_C(_, 12, (_,12)) => 7 
  case CC_C(_, _, (0,12)) => 8 
  case CC_C(CC_D(), _, (0,_)) => 9 
  case CC_C(CC_D(), 12, _) => 10 
  case CC_C(_, 12, _) => 11 
  case CC_C(_, _, (_,_)) => 12 
  case CC_C(_, 12, (0,12)) => 13 
  case CC_C(CC_D(), _, (_,_)) => 14 
  case CC_A(_, CC_A(_, _)) => 15 
  case CC_A(CC_D(), _) => 16 
}
}
// This is not matched: (CC_A (T_A Byte Char)
//      (CC_A Char Byte Boolean Boolean Boolean Boolean)
//      Boolean
//      Wildcard
//      (CC_B (CC_A Char Byte Boolean Boolean Boolean Boolean)
//            (CC_A Char Byte Boolean Boolean Boolean (T_A Boolean Boolean))
//            (T_A (CC_A Char Byte Boolean Boolean Boolean Boolean)
//                 (CC_A Char Byte Boolean Boolean Boolean (T_A Boolean Boolean))))
//      (T_A (CC_A Char Byte Boolean Boolean Boolean Boolean) (T_A Byte Char)))
// This is not matched: (CC_B Boolean Boolean Wildcard Wildcard (T_A Boolean))