package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B[C](a: C, b: CC_A[C], c: T_A[C]) extends T_A[C]
case class CC_C[D]() extends T_A[D]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_C()) => 0 
}
}
// This is not matched: (CC_A (CC_B Wildcard
//            (CC_C (CC_B (CC_A Wildcard Wildcard T_A) Wildcard Wildcard T_A)
//                  Wildcard
//                  Wildcard
//                  T_A)
//            Wildcard
//            T_A)
//      Wildcard
//      T_A)