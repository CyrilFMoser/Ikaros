package Program_31 

package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: B, c: (Byte,Int)) extends T_A[B]
case class CC_B[C]() extends T_A[C]
case class CC_C[D, E](a: T_A[D], b: T_A[E]) extends T_A[D]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(CC_B(), 12, (0,12)) => 1 
  case CC_A(CC_B(), _, (0,_)) => 2 
  case CC_A(CC_B(), 12, _) => 3 
  case CC_A(CC_C(_, _), 12, (_,12)) => 4 
  case CC_A(CC_B(), _, _) => 5 
  case CC_A(_, _, (_,_)) => 6 
  case CC_A(CC_C(_, _), _, (0,12)) => 7 
  case CC_A(CC_B(), 12, (0,_)) => 8 
  case CC_A(_, _, (0,_)) => 9 
  case CC_A(CC_C(_, _), _, (0,_)) => 10 
  case CC_C(CC_A(_, _, _), CC_C(_, _)) => 11 
  case CC_C(CC_B(), CC_C(_, _)) => 12 
  case CC_C(CC_B(), CC_B()) => 13 
  case CC_C(CC_A(_, _, _), CC_A(_, _, _)) => 14 
  case CC_C(_, CC_C(_, _)) => 15 
  case CC_C(CC_C(_, _), CC_C(_, _)) => 16 
  case CC_C(CC_C(_, _), _) => 17 
  case CC_C(CC_A(_, _, _), CC_B()) => 18 
  case CC_C(CC_B(), CC_A(_, _, _)) => 19 
  case CC_C(_, CC_B()) => 20 
  case CC_C(CC_C(_, _), CC_B()) => 21 
  case CC_C(CC_B(), _) => 22 
}
}
// This is not matched: (CC_C Int
//      (T_A (CC_B Boolean Boolean))
//      Wildcard
//      (CC_C (T_A (CC_B Boolean (T_A Boolean)))
//            Boolean
//            Wildcard
//            (CC_B Boolean (T_A Boolean))
//            (T_A (T_A (CC_B Boolean (T_A Boolean)))))
//      (T_A Int))
// This is not matched: (CC_B Int (T_B (T_A Int) Int))