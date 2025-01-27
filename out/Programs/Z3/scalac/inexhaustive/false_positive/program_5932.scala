package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[Byte, Boolean]) extends T_A[C, Boolean]
case class CC_C[E]() extends T_A[E, Boolean]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_C()) => 0 
}
}
// This is not matched: (CC_A Boolean
//      (CC_A Byte Wildcard Wildcard Wildcard (T_A Byte Boolean))
//      (CC_C Boolean (T_A Boolean Boolean))
//      (CC_A Boolean Wildcard Wildcard Wildcard (T_A Boolean Boolean))
//      (T_A Boolean Boolean))