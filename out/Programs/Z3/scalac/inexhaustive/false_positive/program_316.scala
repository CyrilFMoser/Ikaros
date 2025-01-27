package Program_27 

package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Byte, b: T_A[B]) extends T_A[B]
case class CC_B[C, D](a: CC_A[D], b: C, c: D) extends T_A[C]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(0, CC_A(_, _)) => 1 
  case CC_A(0, CC_B(_, _, _)) => 2 
  case CC_A(_, CC_B(_, _, _)) => 3 
}
}
// This is not matched: (CC_A Byte
//      Wildcard
//      (CC_B Byte
//            Char
//            (CC_A Char Byte Wildcard (T_A Char))
//            Wildcard
//            Wildcard
//            (T_A Byte))
//      (T_A Byte))
// This is not matched: (CC_A (Tuple T_B Char) T_B (T_A (Tuple T_B Char)))