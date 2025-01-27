package Program_15 

package Program_15 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: (T_A,Boolean), c: T_A) extends T_A
case class CC_B[A]() extends T_A
case class CC_C(a: CC_B[T_A], b: CC_B[(Int,Char)], c: T_A) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_B(),_), CC_C(_, _, _)) => 0 
  case CC_A(_, (CC_B(),_), CC_A(_, _, _)) => 1 
  case CC_A(_, (CC_A(_, _, _),_), _) => 2 
  case CC_A(CC_B(), (CC_B(),_), CC_A(_, _, _)) => 3 
  case CC_A(_, (CC_B(),_), CC_B()) => 4 
  case CC_A(CC_B(), _, CC_B()) => 5 
  case CC_A(CC_C(_, _, _), (CC_A(_, _, _),_), CC_B()) => 6 
  case CC_A(CC_C(_, _, _), _, _) => 7 
  case CC_A(CC_A(_, _, _), (CC_B(),_), CC_A(_, _, _)) => 8 
  case CC_A(CC_B(), _, CC_A(_, _, _)) => 9 
  case CC_A(_, (CC_C(_, _, _),_), CC_A(_, _, _)) => 10 
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 11 
  case CC_A(CC_B(), (CC_A(_, _, _),_), CC_C(_, _, _)) => 12 
  case CC_A(CC_A(_, _, _), (CC_A(_, _, _),_), CC_B()) => 13 
  case CC_A(_, _, CC_C(_, _, _)) => 14 
  case CC_A(CC_B(), (CC_C(_, _, _),_), CC_C(_, _, _)) => 15 
  case CC_A(CC_C(_, _, _), (CC_C(_, _, _),_), _) => 16 
  case CC_A(CC_A(_, _, _), (CC_C(_, _, _),_), CC_C(_, _, _)) => 17 
  case CC_A(CC_B(), (CC_A(_, _, _),_), CC_A(_, _, _)) => 18 
  case CC_A(CC_A(_, _, _), (CC_B(),_), CC_B()) => 19 
  case CC_A(_, (CC_A(_, _, _),_), CC_A(_, _, _)) => 20 
  case CC_A(CC_C(_, _, _), (CC_A(_, _, _),_), CC_A(_, _, _)) => 21 
  case CC_A(CC_A(_, _, _), (CC_A(_, _, _),_), CC_C(_, _, _)) => 22 
  case CC_A(CC_A(_, _, _), (CC_C(_, _, _),_), _) => 23 
  case CC_A(CC_C(_, _, _), _, CC_B()) => 24 
  case CC_A(_, (CC_C(_, _, _),_), _) => 25 
}
}
// This is not matched: (CC_A (CC_B T_A T_A) (Tuple (CC_B T_A T_A) Boolean) (CC_B T_A T_A) T_A)
// This is not matched: (CC_A (CC_B T_A T_A) (Tuple (CC_B T_A T_A) Boolean) (CC_B T_A T_A) T_A)