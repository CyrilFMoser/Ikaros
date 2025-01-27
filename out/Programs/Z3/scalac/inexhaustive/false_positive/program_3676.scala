package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_D[D](a: (Int,CC_B)) extends T_B[CC_A, D]

val v_a: CC_D[Boolean] = null
val v_b: Int = v_a match{
  case CC_D((12,_)) => 0 
}
}
// This is not matched: (CC_C (CC_B Wildcard Wildcard Int T_A) Wildcard T_A)