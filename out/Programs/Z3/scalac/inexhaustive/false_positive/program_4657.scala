package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[Boolean]) extends T_A[B]
case class CC_C[D]() extends T_A[D]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C()) => 0 
}
}
// This is not matched: (CC_A Byte
//      Wildcard
//      (CC_B Boolean Wildcard Wildcard Wildcard (T_A Boolean))
//      (T_A Byte))