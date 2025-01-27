package Program_15 

package Program_0 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: (T_A,(Int,Boolean)), c: T_A) extends T_A
case class CC_B[A]() extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, (CC_A(_, _, _),(_,_)), CC_A(_, _, _)) => 1 
  case CC_A(CC_A(_, _, _), _, CC_B()) => 2 
  case CC_A(CC_A(_, _, _), (CC_B(),(_,_)), CC_A(_, _, _)) => 3 
  case CC_A(CC_B(), (CC_B(),(_,_)), CC_B()) => 4 
  case CC_A(CC_B(), (CC_B(),(_,_)), _) => 5 
  case CC_A(CC_B(), (CC_B(),(_,_)), CC_A(_, _, _)) => 6 
  case CC_A(CC_A(_, _, _), (CC_A(_, _, _),(_,_)), CC_B()) => 7 
  case CC_A(_, (CC_A(_, _, _),(_,_)), _) => 8 
  case CC_A(CC_A(_, _, _), (CC_B(),(_,_)), _) => 9 
  case CC_A(_, (CC_A(_, _, _),(_,_)), CC_B()) => 10 
  case CC_A(CC_B(), _, CC_A(_, _, _)) => 11 
}
}
// This is not matched: (CC_B T_A T_A)
// This is not matched: (CC_A (CC_A (CC_C T_A) Wildcard (Tuple Wildcard Wildcard) T_A)
//      Wildcard
//      Wildcard
//      T_A)