package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B) extends T_A[B]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_A (CC_C T_B T_B T_B T_B)
//      (T_A (CC_C T_B T_B T_B T_B) (CC_C T_B T_B T_B T_B))
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A (CC_C T_B T_B T_B T_B)
//           (T_A (CC_C T_B T_B T_B T_B) (CC_C T_B T_B T_B T_B))))