package Program_15 

package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_A[E, Byte], b: T_A[E, E], c: F) extends T_A[F, E]
case class CC_B[H, G]() extends T_A[H, G]
case class CC_C[I, J](a: T_B[Char, I], b: T_A[Int, Char], c: T_B[I, J]) extends T_B[Char, I]
case class CC_D(a: T_A[Char, Int]) extends T_B[T_A[(Boolean,Boolean), Boolean], T_A[Char, Int]]

val v_a: T_B[Char, CC_D] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B(), _) => 0 
  case CC_C(CC_C(_, _, _), CC_A(_, _, _), _) => 1 
}
}
// This is not matched: (CC_C (CC_D Boolean Boolean)
//      Boolean
//      Wildcard
//      (CC_A Int
//            Char
//            (CC_A Char
//                  Byte
//                  Wildcard
//                  (CC_B Byte Byte (T_A Byte Byte))
//                  Char
//                  (T_A Char Byte))
//            Wildcard
//            Int
//            (T_A Int Char))
//      Wildcard
//      (T_B Char (CC_D Boolean Boolean)))
// This is not matched: Pattern match is empty without constants