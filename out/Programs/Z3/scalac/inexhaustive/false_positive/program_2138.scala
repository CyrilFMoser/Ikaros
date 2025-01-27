package Program_31 

package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: C, b: (Byte,Int)) extends T_A[D, C]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(12, (_,_)) => 0 
  case CC_A(12, _) => 1 
  case CC_A(12, (_,12)) => 2 
  case CC_A(12, (0,_)) => 3 
  case CC_A(_, (0,12)) => 4 
  case CC_A(_, _) => 5 
  case CC_A(_, (_,_)) => 6 
}
}
// This is not matched: (CC_A Boolean Int Boolean Wildcard Wildcard (T_A Boolean Int))
// This is not matched: (CC_B Wildcard (CC_C T_A) T_A)