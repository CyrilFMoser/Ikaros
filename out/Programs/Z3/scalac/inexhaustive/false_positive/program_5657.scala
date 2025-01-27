package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B) extends T_A[B]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_C Wildcard
//      (CC_A T_A)
//      (CC_C Wildcard (CC_B Wildcard Int T_A) (CC_B Wildcard Wildcard T_A) T_A)
//      T_A)