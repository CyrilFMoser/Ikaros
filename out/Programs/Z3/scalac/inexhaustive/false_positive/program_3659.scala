package Program_15 

package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[(Boolean,Boolean)]) extends T_A
case class CC_B[B, C](a: T_B[B], b: T_B[CC_A], c: B) extends T_B[B]
case class CC_C(a: CC_A, b: CC_B[Boolean, CC_A], c: Int) extends T_B[CC_B[CC_A, Char]]

val v_a: CC_B[Char, Char] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, _, _), 'x') => 0 
  case CC_B(CC_B(_, _, _), CC_B(_, _, _), 'x') => 1 
  case CC_B(_, _, 'x') => 2 
  case CC_B(CC_B(_, _, _), _, 'x') => 3 
  case CC_B(CC_B(_, _, _), _, _) => 4 
}
}
// This is not matched: (CC_B Char
//      Char
//      (CC_B Char
//            T_A
//            (CC_B Char T_A Wildcard Wildcard Char (T_B Char))
//            (CC_B (CC_A T_A T_A T_A)
//                  T_A
//                  Wildcard
//                  Wildcard
//                  Wildcard
//                  (T_B (CC_A T_A T_A T_A)))
//            Char
//            (T_B Char))
//      Wildcard
//      Wildcard
//      (T_B Char))
// This is not matched: (CC_B Char
//      Char
//      (CC_B Char
//            T_A
//            (CC_B Char T_A Wildcard Wildcard Char (T_B Char))
//            (CC_B (CC_A T_A T_A T_A)
//                  T_A
//                  Wildcard
//                  Wildcard
//                  Wildcard
//                  (T_B (CC_A T_A T_A T_A)))
//            Char
//            (T_B Char))
//      Wildcard
//      Wildcard
//      (T_B Char))