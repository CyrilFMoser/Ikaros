package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[(Char,Char)], b: T_B[T_A], c: (T_A,T_A)) extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_B[T_A]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, (CC_B(),_)) => 0 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard Wildcard T_A)