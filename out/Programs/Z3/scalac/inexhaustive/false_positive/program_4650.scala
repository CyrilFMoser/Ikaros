package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte) extends T_A[C, (Byte,Boolean)]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_A Wildcard
//      Wildcard
//      (Tuple (CC_A (CC_B T_A) Wildcard Wildcard T_A) (CC_B T_A))
//      T_A)