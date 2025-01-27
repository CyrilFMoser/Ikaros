package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_B[B](a: (Byte,T_A)) extends T_B[B]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B((0,_)) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard Wildcard T_A)