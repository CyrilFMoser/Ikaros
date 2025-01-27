package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, (Boolean,Byte)], b: T_A[C, C], c: T_A[D, D]) extends T_A[C, D]
case class CC_B[F, E]() extends T_A[F, E]

val v_a: CC_A[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_B()) => 0 
}
}
// This is not matched: (CC_B (CC_A T_A)
//      (CC_B Wildcard Wildcard Wildcard T_A)
//      (CC_B Wildcard (CC_B Wildcard (CC_A T_A) Wildcard T_A) (CC_A T_A) T_A)
//      T_A)