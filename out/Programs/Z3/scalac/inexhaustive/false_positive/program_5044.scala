package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B[C](a: Int, b: T_B[C, C]) extends T_B[C, CC_A]

val v_a: T_B[Char, CC_A] = null
val v_b: Int = v_a match{
  case CC_B(12, _) => 0 
}
}
// This is not matched: (CC_A (CC_A (CC_B (CC_A Wildcard
//                        (CC_B (CC_A Wildcard Wildcard Wildcard T_A) T_A)
//                        Wildcard
//                        T_A)
//                  T_A)
//            (CC_B (CC_A (CC_B Wildcard T_A) Wildcard (CC_B Wildcard T_A) T_A)
//                  T_A)
//            (CC_B Wildcard T_A)
//            T_A)
//      Wildcard
//      (CC_A (CC_B Wildcard T_A) Wildcard Wildcard T_A)
//      T_A)