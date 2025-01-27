package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: (Byte,Int)) extends T_A[B]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A((_,12)) => 0 
}
}
// This is not matched: (CC_D Wildcard Wildcard T_B)