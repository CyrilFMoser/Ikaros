package Program_15 

object Test {
sealed trait T_A[A]
case class CC_B[C](a: C) extends T_A[C]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
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