package Program_28 

package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C](a: (T_B,T_B), b: Boolean, c: T_B) extends T_A[D, C]
case class CC_B[E](a: T_A[E, E], b: T_A[E, T_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), _) => 0 
  case CC_B(_, _) => 1 
  case CC_B(_, CC_A(_, _, _)) => 2 
}
}
// This is not matched: (CC_B T_B Wildcard Wildcard T_B)
// This is not matched: (CC_A Char
//      (CC_A Char
//            (CC_B Char Char (CC_B Char Char Wildcard (T_A Char)) (T_A Char))
//            Byte
//            (T_A Char))
//      Wildcard
//      (T_A Char))