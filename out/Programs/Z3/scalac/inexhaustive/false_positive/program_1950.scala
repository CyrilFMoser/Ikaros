package Program_30 

package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Byte,Int), b: (Char,Char)) extends T_A[T_A[Char]]
case class CC_B[B](a: T_A[B], b: T_A[B]) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), (_,_)) => 0 
  case CC_A((0,12), (_,'x')) => 1 
  case CC_A((_,_), (_,'x')) => 2 
  case CC_A(_, _) => 3 
  case CC_A((0,_), (_,'x')) => 4 
  case CC_A((0,_), ('x','x')) => 5 
  case CC_A((_,12), ('x','x')) => 6 
  case CC_A((_,_), _) => 7 
  case CC_A((_,12), (_,'x')) => 8 
  case CC_A((0,_), (_,_)) => 9 
  case CC_A((_,_), ('x','x')) => 10 
  case CC_A((0,12), ('x','x')) => 11 
  case CC_A((_,_), ('x',_)) => 12 
  case CC_A((0,12), _) => 13 
  case CC_A(_, (_,_)) => 14 
  case CC_A(_, (_,'x')) => 15 
  case CC_A((_,12), _) => 16 
  case CC_A((0,12), ('x',_)) => 17 
  case CC_A((0,_), ('x',_)) => 18 
  case CC_B(CC_A(_, _), CC_B(_, _)) => 19 
  case CC_B(CC_A(_, _), CC_A(_, _)) => 20 
  case CC_B(_, CC_A(_, _)) => 21 
  case CC_B(_, _) => 22 
  case CC_B(CC_B(_, _), CC_B(_, _)) => 23 
  case CC_B(CC_B(_, _), CC_A(_, _)) => 24 
  case CC_B(_, CC_B(_, _)) => 25 
}
}
// This is not matched: (CC_B (T_A Char)
//      (CC_B Boolean Wildcard Wildcard (T_A (T_A Char)))
//      (CC_A Wildcard Wildcard (T_A (T_A Char)))
//      (T_A (T_A Char)))
// This is not matched: (CC_A Int Byte (T_A Int Byte))