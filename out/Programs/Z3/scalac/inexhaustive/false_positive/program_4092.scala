package Program_14 

package Program_5 

object Test {
sealed trait T_A
case class CC_A[A](a: (T_A,Int), b: Boolean) extends T_A
case class CC_B(a: (T_A,Boolean), b: (Byte,T_A), c: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_A((CC_A(_, _),12), _) => 1 
  case CC_B(_, _, CC_A(_, _)) => 2 
  case CC_B((CC_A(_, _),_), _, _) => 3 
  case CC_B((CC_B(_, _, _),_), (_,CC_A(_, _)), CC_B(_, _, _)) => 4 
  case CC_B((CC_A(_, _),_), (0,CC_A(_, _)), CC_B(_, _, _)) => 5 
  case CC_B((CC_B(_, _, _),_), (0,CC_B(_, _, _)), CC_A(_, _)) => 6 
  case CC_B((CC_A(_, _),_), (_,CC_B(_, _, _)), CC_B(_, _, _)) => 7 
  case CC_B(_, (_,CC_A(_, _)), _) => 8 
  case CC_B(_, (_,CC_B(_, _, _)), _) => 9 
  case CC_B((CC_B(_, _, _),_), (_,CC_B(_, _, _)), CC_B(_, _, _)) => 10 
  case CC_B((CC_B(_, _, _),_), (_,CC_A(_, _)), CC_A(_, _)) => 11 
  case CC_B((CC_A(_, _),_), (_,CC_A(_, _)), CC_B(_, _, _)) => 12 
  case CC_B((CC_B(_, _, _),_), (0,CC_A(_, _)), CC_B(_, _, _)) => 13 
  case CC_B(_, (_,CC_A(_, _)), CC_B(_, _, _)) => 14 
  case CC_B((CC_A(_, _),_), _, CC_A(_, _)) => 15 
  case CC_B(_, _, CC_B(_, _, _)) => 16 
  case CC_B(_, (0,CC_B(_, _, _)), CC_B(_, _, _)) => 17 
  case CC_B(_, (0,CC_A(_, _)), CC_A(_, _)) => 18 
  case CC_B((CC_B(_, _, _),_), (0,CC_A(_, _)), _) => 19 
  case CC_B(_, (_,CC_B(_, _, _)), CC_A(_, _)) => 20 
  case CC_B((CC_A(_, _),_), _, CC_B(_, _, _)) => 21 
  case CC_B((CC_B(_, _, _),_), (_,CC_B(_, _, _)), _) => 22 
  case CC_B(_, _, _) => 23 
  case CC_B(_, (0,CC_A(_, _)), _) => 24 
  case CC_B(_, (_,CC_B(_, _, _)), CC_B(_, _, _)) => 25 
  case CC_B((CC_B(_, _, _),_), _, CC_A(_, _)) => 26 
  case CC_B((CC_A(_, _),_), (_,CC_B(_, _, _)), CC_A(_, _)) => 27 
  case CC_B(_, (0,CC_B(_, _, _)), CC_A(_, _)) => 28 
  case CC_B((CC_A(_, _),_), (_,CC_A(_, _)), _) => 29 
  case CC_B((CC_B(_, _, _),_), (_,CC_A(_, _)), _) => 30 
  case CC_B(_, (0,CC_B(_, _, _)), _) => 31 
  case CC_B((CC_A(_, _),_), (0,CC_A(_, _)), _) => 32 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// This is not matched: (CC_A (CC_B T_A T_A) (Tuple (CC_B T_A T_A) Boolean) (CC_B T_A T_A) T_A)