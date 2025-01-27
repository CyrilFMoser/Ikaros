package Program_30 

package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[C, C], b: T_A[C, C], c: (Byte,Byte)) extends T_A[C, D]

val v_a: T_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, (0,_)) => 0 
  case CC_A(_, CC_A(_, _, _), (0,0)) => 1 
  case CC_A(CC_A(_, _, _), _, (_,0)) => 2 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), (_,_)) => 3 
  case CC_A(CC_A(_, _, _), _, (_,_)) => 4 
  case CC_A(CC_A(_, _, _), _, _) => 5 
  case CC_A(_, CC_A(_, _, _), _) => 6 
  case CC_A(_, _, _) => 7 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), (0,0)) => 8 
  case CC_A(_, _, (0,_)) => 9 
  case CC_A(_, CC_A(_, _, _), (0,_)) => 10 
  case CC_A(CC_A(_, _, _), _, (0,0)) => 11 
  case CC_A(_, _, (_,0)) => 12 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), _) => 13 
  case CC_A(_, CC_A(_, _, _), (_,0)) => 14 
}
}
// This is not matched: (CC_A Byte
//      Byte
//      (T_A Boolean Boolean)
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A Byte Byte))
// This is not matched: (CC_C Int Wildcard Wildcard Int (T_A Int))