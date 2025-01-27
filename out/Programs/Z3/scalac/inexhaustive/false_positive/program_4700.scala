package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_B() extends T_A
case class CC_C() extends T_A
case class CC_D[B](a: CC_B, b: (Char,T_A)) extends T_B[B]

val v_a: CC_D[T_A] = null
val v_b: Int = v_a match{
  case CC_D(_, (_,CC_C())) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard Wildcard T_A)