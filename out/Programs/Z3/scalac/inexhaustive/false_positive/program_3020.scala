package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_E[D](a: (T_A,CC_B)) extends T_B[Char, D]

val v_a: CC_E[Char] = null
val v_b: Int = v_a match{
  case CC_E((CC_A(),_)) => 0 
}
}
// This is not matched: (CC_A Wildcard (T_A (T_A Int)))