package Program_29 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: (Int,Byte)) extends T_A[B]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A((_,0)) => 0 
}
}
// This is not matched: (CC_A (CC_A Wildcard Wildcard T_A) (CC_A Wildcard Wildcard T_A) T_A)