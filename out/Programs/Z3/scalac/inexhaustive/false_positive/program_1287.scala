package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int) extends T_A[C, T_A[Boolean, Int]]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_B (CC_C T_A)
//      Wildcard
//      (CC_B (CC_B (CC_C T_A) (CC_A (CC_C T_A) T_A) (CC_C T_A) T_A)
//            Wildcard
//            (CC_C T_A)
//            T_A)
//      T_A)