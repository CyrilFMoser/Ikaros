package Program_31 

package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[C, T_A[C, C]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Byte Boolean (T_A Byte (T_A Byte Byte)))
// This is not matched: (CC_A Wildcard
//      (Tuple Wildcard
//             (CC_A (CC_D T_A
//                         (CC_D Char Wildcard Wildcard Wildcard (T_B Char))
//                         (CC_B Wildcard T_A)
//                         Wildcard
//                         (T_B T_A))
//                   Wildcard
//                   T_A))
//      T_A)