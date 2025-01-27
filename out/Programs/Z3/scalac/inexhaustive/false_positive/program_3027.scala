package Program_15 

package Program_12 

object Test {
sealed trait T_A
case class CC_A[A](a: (Byte,Byte), b: A, c: ((Byte,Byte),Byte)) extends T_A
case class CC_B(a: T_A, b: (T_A,(Char,Char)), c: Byte) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((0,_), _, _) => 0 
  case CC_A(_, _, ((_,_),0)) => 1 
  case CC_A((_,0), _, _) => 2 
  case CC_A((_,_), _, ((_,_),_)) => 3 
  case CC_A((_,_), _, _) => 4 
  case CC_A((0,0), _, ((_,_),0)) => 5 
  case CC_B(_, _, 0) => 6 
  case CC_B(CC_A(_, _, _), (CC_B(_, _, _),(_,_)), _) => 7 
  case CC_B(CC_A(_, _, _), _, _) => 8 
  case CC_B(CC_B(_, _, _), (CC_A(_, _, _),(_,_)), _) => 9 
  case CC_B(CC_A(_, _, _), (CC_A(_, _, _),(_,_)), _) => 10 
  case CC_B(CC_B(_, _, _), _, 0) => 11 
  case CC_B(_, (CC_B(_, _, _),(_,_)), _) => 12 
  case CC_B(CC_B(_, _, _), (CC_B(_, _, _),(_,_)), _) => 13 
  case CC_B(_, (CC_B(_, _, _),(_,_)), 0) => 14 
  case CC_B(_, (CC_A(_, _, _),(_,_)), _) => 15 
  case CC_B(CC_B(_, _, _), (CC_B(_, _, _),(_,_)), 0) => 16 
  case CC_B(_, (CC_A(_, _, _),(_,_)), 0) => 17 
}
}
// This is not matched: (CC_B (CC_A Boolean Wildcard Boolean Wildcard T_A)
//      (Tuple (CC_A Boolean Wildcard Boolean Wildcard T_A) Wildcard)
//      Wildcard
//      T_A)
// This is not matched: Pattern match is empty without constants