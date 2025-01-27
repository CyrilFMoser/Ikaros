package Program_31 

package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: E, b: C, c: T_A[Boolean, C]) extends T_A[D, C]
case class CC_B(a: T_A[Int, (Char,Char)], b: T_A[Byte, Byte]) extends T_A[CC_A[Byte, Byte, Char], T_A[Char, Int]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), _) => 0 
  case CC_B(_, CC_A(_, _, _)) => 1 
}
}
// This is not matched: (CC_B (CC_A Int
//            (Tuple Char Char)
//            Boolean
//            Boolean
//            Wildcard
//            Wildcard
//            (T_A Int (Tuple Char Char)))
//      (CC_A Byte
//            Byte
//            Boolean
//            Wildcard
//            Wildcard
//            (CC_A Boolean Byte Byte Byte Wildcard Wildcard (T_A Boolean Byte))
//            (T_A Byte Byte))
//      (T_A (CC_A Byte Byte Char Boolean Boolean Boolean Boolean) (T_A Char Int)))
// This is not matched: (CC_E Int (T_B Int))