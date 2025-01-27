package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_B() extends T_A[T_A[Byte, Byte], Byte]
case class CC_C() extends T_A[T_A[(CC_B,T_B), (CC_B,T_B)], (CC_B,T_B)]
case class CC_E(a: (T_B,CC_B), b: T_A[(Byte,Boolean), CC_C]) extends T_B
case class CC_F() extends T_B

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E((CC_F(),_), _) => 0 
}
}
// This is not matched: (CC_B T_A Wildcard T_A)