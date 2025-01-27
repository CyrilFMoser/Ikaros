package Program_31 

package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: (Boolean,Byte)) extends T_A[T_A[Boolean]]
case class CC_B[C](a: T_A[C], b: (Char,Byte), c: T_A[C]) extends T_A[C]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), (_,0), CC_B(_, _, _)) => 1 
  case CC_B(CC_B(_, _, _), (_,0), CC_A(_)) => 2 
  case CC_B(_, (_,0), _) => 3 
  case CC_B(CC_A(_), _, _) => 4 
  case CC_B(CC_B(_, _, _), ('x',0), CC_B(_, _, _)) => 5 
  case CC_B(_, _, _) => 6 
  case CC_B(CC_A(_), ('x',0), CC_B(_, _, _)) => 7 
  case CC_B(CC_B(_, _, _), ('x',_), CC_A(_)) => 8 
  case CC_B(CC_A(_), ('x',_), CC_B(_, _, _)) => 9 
  case CC_B(CC_B(_, _, _), (_,_), CC_B(_, _, _)) => 10 
  case CC_B(_, (_,_), CC_A(_)) => 11 
  case CC_B(CC_A(_), (_,0), _) => 12 
  case CC_B(_, (_,_), CC_B(_, _, _)) => 13 
  case CC_B(_, ('x',_), CC_A(_)) => 14 
  case CC_B(CC_A(_), _, CC_A(_)) => 15 
  case CC_B(_, ('x',0), _) => 16 
  case CC_B(_, ('x',0), CC_A(_)) => 17 
  case CC_B(CC_B(_, _, _), _, CC_B(_, _, _)) => 18 
  case CC_B(CC_A(_), ('x',_), _) => 19 
  case CC_B(_, (_,_), _) => 20 
  case CC_B(_, _, CC_B(_, _, _)) => 21 
  case CC_B(CC_A(_), (_,_), _) => 22 
  case CC_B(CC_B(_, _, _), ('x',0), CC_A(_)) => 23 
  case CC_B(CC_B(_, _, _), _, CC_A(_)) => 24 
  case CC_B(_, ('x',_), _) => 25 
  case CC_B(CC_A(_), (_,_), CC_A(_)) => 26 
  case CC_B(CC_B(_, _, _), ('x',0), _) => 27 
  case CC_B(_, ('x',0), CC_B(_, _, _)) => 28 
  case CC_B(_, (_,0), CC_A(_)) => 29 
  case CC_B(CC_B(_, _, _), ('x',_), _) => 30 
  case CC_B(CC_B(_, _, _), ('x',_), CC_B(_, _, _)) => 31 
  case CC_B(CC_A(_), ('x',0), CC_A(_)) => 32 
  case CC_B(CC_A(_), ('x',_), CC_A(_)) => 33 
  case CC_B(CC_A(_), (_,0), CC_A(_)) => 34 
  case CC_B(CC_A(_), (_,_), CC_B(_, _, _)) => 35 
  case CC_B(CC_B(_, _, _), (_,0), CC_B(_, _, _)) => 36 
  case CC_B(_, _, CC_A(_)) => 37 
  case CC_B(CC_A(_), _, CC_B(_, _, _)) => 38 
  case CC_B(_, ('x',_), CC_B(_, _, _)) => 39 
}
}
// This is not matched: (CC_A Boolean Wildcard (T_A (T_A Boolean)))
// This is not matched: (CC_B Wildcard Wildcard Wildcard T_A)