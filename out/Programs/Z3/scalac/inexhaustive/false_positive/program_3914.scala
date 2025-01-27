package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B, b: T_A[B], c: T_A[B]) extends T_A[B]
case class CC_C[D]() extends T_A[D]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
}
}
// This is not matched: (CC_A (Tuple (CC_C Wildcard Wildcard (CC_A (Tuple Wildcard Wildcard) T_A) T_A)
//             (CC_B (Generic "A") Wildcard (CC_A Wildcard T_A) T_A))
//      T_A)