package Program_30 

package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[C], b: (Char,Byte)) extends T_A[B]
case class CC_B[D]() extends T_A[D]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(CC_A(_, _), (_,_)) => 1 
  case CC_A(_, ('x',0)) => 2 
  case CC_A(_, ('x',_)) => 3 
  case CC_A(CC_A(_, _), ('x',_)) => 4 
  case CC_A(_, _) => 5 
  case CC_A(CC_B(), (_,0)) => 6 
  case CC_A(_, (_,_)) => 7 
  case CC_A(CC_B(), ('x',_)) => 8 
  case CC_A(_, (_,0)) => 9 
  case CC_A(CC_A(_, _), ('x',0)) => 10 
}
}
// This is not matched: (CC_A Int
//      (T_A (CC_B (CC_B Boolean (T_A Boolean)) Boolean))
//      (CC_B (T_A (CC_B (CC_B Boolean Boolean) Boolean))
//            (T_A (T_A (CC_B (CC_B Boolean Boolean) Boolean))))
//      Wildcard
//      (T_A Int))
// This is not matched: (CC_C (Tuple (CC_C Wildcard Wildcard Wildcard T_A) Wildcard)
//      Wildcard
//      Wildcard
//      T_A)