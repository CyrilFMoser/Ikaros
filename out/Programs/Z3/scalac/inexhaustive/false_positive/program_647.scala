package Program_31 

package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[Char, T_A[Boolean, Char]]

val v_a: T_A[Char, T_A[Boolean, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Boolean Wildcard (T_A Char (T_A Boolean Char)))
// This is not matched: (CC_B (CC_C Wildcard Wildcard Wildcard T_B)
//      (CC_C (CC_B Wildcard
//                  (CC_D T_B)
//                  (T_A (T_A Boolean T_B) (T_A (Tuple Boolean Byte) T_B)))
//            (CC_C Wildcard (CC_D T_B) Wildcard T_B)
//            Wildcard
//            T_B)
//      (T_A (T_A Boolean T_B) (T_A (Tuple Boolean Byte) T_B)))