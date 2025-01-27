package Program_12 

package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: Byte, b: T_A[C, D], c: C) extends T_A[C, T_A[C, C]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(0, CC_A(_, _, _), 0) => 0 
  case CC_A(0, CC_A(_, _, _), _) => 1 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_A Byte
//      Wildcard
//      (CC_A Byte
//            Wildcard
//            (CC_A Byte
//                  Byte
//                  (CC_B Byte Wildcard Wildcard Wildcard (T_A Byte))
//                  (T_A Byte))
//            (T_A Byte))
//      (T_A Byte))