package Program_31 

package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_A,(Byte,Int))) extends T_A
case class CC_B[C]() extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_) => 1 
  case CC_A((CC_A(_),(_,_))) => 2 
}
}
// This is not matched: (CC_B T_A T_A)
// This is not matched: (CC_A (Tuple Wildcard Wildcard) (T_A (T_A Byte)))