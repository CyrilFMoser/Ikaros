package Program_31 

package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: Char, b: B) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// This is not matched: (CC_C Int
//      Char
//      (CC_C Char
//            Int
//            (CC_B Int
//                  Char
//                  Int
//                  (CC_B Char
//                        Char
//                        Int
//                        (CC_B Char Char Int Wildcard (T_A Char Char))
//                        (T_A Char Char))
//                  (T_A Char Int))
//            Wildcard
//            Wildcard
//            (T_A Int Char))
//      Wildcard
//      Wildcard
//      (T_A Char Int))