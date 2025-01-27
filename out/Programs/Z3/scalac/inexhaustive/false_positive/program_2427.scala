package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Boolean,Char), b: T_A[C, (Byte,Boolean)]) extends T_A[C, T_A[C, C]]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A((_,'x'), _) => 0 
}
}
// This is not matched: (CC_B (Tuple (CC_B Wildcard Wildcard T_A) (CC_B Wildcard Wildcard T_A))
//      Wildcard
//      T_A)