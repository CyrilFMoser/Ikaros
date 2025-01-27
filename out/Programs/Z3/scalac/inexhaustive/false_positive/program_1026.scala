package Program_31 

package Program_2 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A, b: T_A, c: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_B Char
//      (CC_A Char
//            Char
//            (Tuple Int Char)
//            Wildcard
//            (CC_C Char (T_A (Tuple Int Char) Char))
//            (T_A Char Char))
//      Wildcard
//      Wildcard
//      (T_A (Tuple Int Char) Char))