package Program_13 

object Test {
sealed trait T_A[A]
case class CC_B[C](a: (Byte,Boolean)) extends T_A[C]

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B((0,_)) => 0 
}
}
// This is not matched: (CC_B Boolean
//      (CC_B Boolean Wildcard Wildcard Wildcard (T_A Boolean))
//      Wildcard
//      Wildcard
//      (T_A Boolean))