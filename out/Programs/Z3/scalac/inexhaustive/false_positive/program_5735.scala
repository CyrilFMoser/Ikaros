package Program_11 

package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B[C, D](a: T_B[C, D]) extends T_B[C, D]
case class CC_C[E, F, G](a: T_B[CC_A, Char], b: CC_A) extends T_B[F, E]

val v_a: CC_C[Int, CC_A, Boolean] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_), CC_A()) => 0 
  case CC_C(CC_C(_, _), CC_A()) => 1 
}
}
// This is not matched: (CC_C Int
//      (CC_A (T_B T_A T_A))
//      Boolean
//      (CC_C Char
//            (CC_A Wildcard)
//            T_A
//            (CC_B (CC_A Wildcard)
//                  Char
//                  (CC_C Char
//                        (CC_A Wildcard)
//                        T_A
//                        (CC_C Char
//                              (CC_A T_A)
//                              T_A
//                              Wildcard
//                              Wildcard
//                              (T_B (CC_A T_A) Char))
//                        Wildcard
//                        (T_B (CC_A Wildcard) Char))
//                  (T_B (CC_A Wildcard) Char))
//            (CC_A T_A)
//            (T_B (CC_A Wildcard) Char))
//      Wildcard
//      (T_B (CC_A (T_B T_A T_A)) Int))
// This is not matched: (CC_A Char Boolean Wildcard Wildcard (T_A Char))