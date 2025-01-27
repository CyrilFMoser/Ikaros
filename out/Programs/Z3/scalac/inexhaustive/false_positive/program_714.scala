package Program_31 

package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_B[D, D], c: T_B[D, D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F, G, H](a: CC_A[Int], b: CC_A[H], c: CC_A[H]) extends T_B[F, G]
case class CC_D[I](a: Char, b: ((Boolean,Char),Byte), c: T_A[I]) extends T_B[I, CC_C[I, I, I]]
case class CC_E() extends T_B[T_B[Boolean, Boolean], CC_C[T_B[Boolean, Boolean], T_B[Boolean, Boolean], T_B[Boolean, Boolean]]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, CC_C(_, _, _), _) => 1 
}
}
// This is not matched: (CC_A Int
//      Wildcard
//      (CC_C Int
//            Int
//            (CC_E Boolean)
//            Wildcard
//            (CC_A (CC_E (T_A Boolean))
//                  Wildcard
//                  (CC_C (CC_E (T_A Boolean))
//                        (CC_E (T_A Boolean))
//                        Boolean
//                        Wildcard
//                        Wildcard
//                        Wildcard
//                        (T_B (CC_E (T_A Boolean)) (CC_E (T_A Boolean))))
//                  Wildcard
//                  (T_A (CC_E (T_A Boolean))))
//            Wildcard
//            (T_B Int Int))
//      Wildcard
//      (T_A Int))
// This is not matched: (CC_D (Tuple Boolean (CC_B (Tuple Byte Wildcard) Wildcard T_B)) T_B)