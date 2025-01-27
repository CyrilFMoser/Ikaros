package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[Boolean, Boolean]
case class CC_B() extends T_A[Boolean, Boolean]
case class CC_E[E](a: T_B[E, E], b: T_A[Boolean, Boolean]) extends T_B[Boolean, E]

val v_a: T_B[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_E(_, CC_A()) => 0 
}
}
// This is not matched: (CC_E Byte
//      Wildcard
//      (CC_B Wildcard (Tuple Wildcard Wildcard) (T_A Boolean Boolean))
//      (T_B Boolean Byte))