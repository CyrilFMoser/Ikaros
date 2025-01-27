package Program_31 

package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E, F](a: T_A[Int, D], b: E) extends T_A[D, E]
case class CC_B[G](a: T_A[Byte, G], b: T_A[G, G]) extends T_B[G]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _)) => 0 
}
}
// This is not matched: (CC_B Char
//      Wildcard
//      (CC_A Char
//            Char
//            Boolean
//            (CC_A Int
//                  Char
//                  Boolean
//                  (CC_A Int
//                        Int
//                        Boolean
//                        (CC_A Int Int Boolean Wildcard Wildcard (T_A Int Int))
//                        Int
//                        (T_A Int Int))
//                  Wildcard
//                  (T_A Int Char))
//            Wildcard
//            (T_A Char Char))
//      (T_B Char))
// This is not matched: (CC_D (CC_C Boolean Wildcard (T_B Boolean))
//      Wildcard
//      (T_B (CC_C (CC_B T_A) T_A T_A)))