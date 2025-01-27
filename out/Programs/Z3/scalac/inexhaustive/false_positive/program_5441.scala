package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C](a: T_B) extends T_A[C, D]
case class CC_B() extends T_B
case class CC_D() extends T_B

val v_a: CC_A[Boolean, T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_D()) => 0 
}
}
// This is not matched: (CC_A Wildcard
//      (CC_B Wildcard Wildcard (CC_A Wildcard Wildcard Int T_A) T_A)
//      Wildcard
//      T_A)