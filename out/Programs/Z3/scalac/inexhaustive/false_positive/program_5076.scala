package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B) extends T_A[B]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_B (CC_A T_A T_A)
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_B (CC_A T_A T_A) (CC_A T_A T_A)))