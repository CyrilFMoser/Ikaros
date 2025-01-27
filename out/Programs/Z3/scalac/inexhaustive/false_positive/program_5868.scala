package Program_11 

package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E]() extends T_A[F, E]
case class CC_B[H, G, I](a: H, b: T_A[I, H], c: T_B[H, G]) extends T_A[G, H]
case class CC_C[J](a: T_A[J, J], b: (Int,Byte)) extends T_B[CC_B[Char, Int, Boolean], J]
case class CC_D(a: T_B[Boolean, Int], b: T_A[Int, Char], c: Int) extends T_B[CC_B[Char, Int, Boolean], CC_A[Byte, Int]]
case class CC_E(a: T_B[Char, CC_D]) extends T_B[CC_B[Char, Int, Boolean], CC_A[Byte, Int]]

val v_a: CC_C[CC_E] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(), (_,_)) => 0 
}
}
// This is not matched: (CC_C (CC_E Boolean Boolean)
//      (CC_B (CC_E Boolean Boolean)
//            (CC_E Boolean Boolean)
//            (CC_E Boolean (T_A Boolean Boolean))
//            Wildcard
//            (CC_B (CC_E (T_A Boolean Boolean) Boolean)
//                  (CC_E Boolean Boolean)
//                  Boolean
//                  Wildcard
//                  (CC_A Boolean
//                        (CC_E (T_A Boolean Boolean) Boolean)
//                        (T_A Boolean (CC_E (T_A Boolean Boolean) Boolean)))
//                  Wildcard
//                  (T_A (CC_E Boolean Boolean)
//                       (CC_E (T_A Boolean Boolean) Boolean)))
//            Wildcard
//            (T_A (CC_E Boolean Boolean) (CC_E Boolean Boolean)))
//      Wildcard
//      (T_B (CC_B Char Int Boolean Boolean Boolean Boolean Boolean)
//           (CC_E Boolean Boolean)))
// This is not matched: (CC_B Char
//      (CC_B Char (CC_B Char Wildcard Wildcard (T_A Char)) Int (T_A Char))
//      Int
//      (T_A Char))