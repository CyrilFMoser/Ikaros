package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: T_B) extends T_A[C, T_B]
case class CC_D() extends T_B
case class CC_E() extends T_B

val v_a: T_A[Char, T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_E()) => 0 
}
}
// This is not matched: (CC_F (CC_C T_A T_A)
//      Boolean
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_B Boolean (CC_C T_A T_A)))