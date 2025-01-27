package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B[D](a: T_A[D]) extends T_A[D]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
}
}
// This is not matched: (CC_C Boolean
//      Wildcard
//      (Tuple Char Wildcard)
//      (CC_A Boolean (T_A Boolean))
//      (T_B Boolean))