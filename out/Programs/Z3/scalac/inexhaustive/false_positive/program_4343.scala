package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A[C](a: (Byte,Byte)) extends T_A[C]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A((_,0)) => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard (T_A T_B Boolean))