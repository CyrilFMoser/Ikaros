package Program_13 

object Test {
sealed trait T_A
case class CC_A(a: (T_A,Char), b: T_A, c: T_A) extends T_A
case class CC_B() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_B()) => 0 
}
}
// This is not matched: (CC_B Int Wildcard (T_A Int))