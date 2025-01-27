package Program_15 

object Test {
sealed trait T_A[A]
case class CC_B[D](a: T_A[D]) extends T_A[D]
case class CC_C[E]() extends T_A[E]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_)) => 0 
}
}
// This is not matched: (CC_C Boolean
//      Wildcard
//      (Tuple Char Wildcard)
//      (CC_A Boolean (T_A Boolean))
//      (T_B Boolean))