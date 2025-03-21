package Program_13 

package Program_15 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A, b: (T_A,T_A), c: T_A) extends T_A
case class CC_B() extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(CC_B(), (CC_B(),CC_A(_, _, _)), CC_B()) => 1 
  case CC_A(CC_A(_, _, _), _, _) => 2 
  case CC_A(CC_A(_, _, _), _, CC_B()) => 3 
  case CC_A(_, (CC_B(),CC_A(_, _, _)), CC_B()) => 4 
  case CC_A(CC_B(), (CC_B(),CC_B()), CC_B()) => 5 
  case CC_A(CC_A(_, _, _), (CC_B(),CC_B()), CC_B()) => 6 
  case CC_A(_, (CC_A(_, _, _),CC_B()), CC_A(_, _, _)) => 7 
  case CC_A(CC_A(_, _, _), (CC_B(),CC_A(_, _, _)), CC_B()) => 8 
  case CC_A(CC_A(_, _, _), (CC_B(),CC_A(_, _, _)), _) => 9 
  case CC_A(CC_B(), _, CC_A(_, _, _)) => 10 
  case CC_A(_, (CC_A(_, _, _),CC_B()), _) => 11 
  case CC_A(CC_B(), (CC_A(_, _, _),CC_A(_, _, _)), CC_B()) => 12 
  case CC_A(_, (CC_B(),CC_A(_, _, _)), CC_A(_, _, _)) => 13 
  case CC_A(CC_A(_, _, _), (CC_A(_, _, _),CC_A(_, _, _)), CC_A(_, _, _)) => 14 
  case CC_A(_, (CC_A(_, _, _),CC_A(_, _, _)), CC_A(_, _, _)) => 15 
  case CC_A(CC_A(_, _, _), (CC_A(_, _, _),CC_A(_, _, _)), _) => 16 
  case CC_A(_, (CC_B(),CC_A(_, _, _)), _) => 17 
  case CC_A(CC_A(_, _, _), (CC_B(),CC_B()), _) => 18 
  case CC_A(_, (CC_B(),CC_B()), _) => 19 
  case CC_A(CC_B(), (CC_B(),CC_B()), CC_A(_, _, _)) => 20 
  case CC_A(CC_B(), (CC_A(_, _, _),CC_B()), CC_B()) => 21 
  case CC_A(CC_B(), (CC_A(_, _, _),CC_B()), _) => 22 
}
}
// This is not matched: (CC_A T_A
//      (CC_A (CC_A T_A T_A T_A (CC_A T_A T_A T_A T_A T_A) T_A)
//            Wildcard
//            Wildcard
//            Wildcard
//            T_A)
//      Wildcard
//      Wildcard
//      T_A)
// This is not matched: (CC_A T_A
//      (CC_A (CC_A T_A T_A T_A (CC_A T_A T_A T_A T_A T_A) T_A)
//            Wildcard
//            Wildcard
//            Wildcard
//            T_A)
//      Wildcard
//      Wildcard
//      T_A)