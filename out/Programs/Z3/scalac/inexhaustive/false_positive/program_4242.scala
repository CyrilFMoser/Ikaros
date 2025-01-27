package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[C](a: ((Boolean,Char),Int)) extends T_A[C]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A((_,12)) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)