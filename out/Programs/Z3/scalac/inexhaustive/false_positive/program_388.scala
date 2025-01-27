package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Int,Byte), b: T_A[C, C]) extends T_A[C, T_A[Char, Int]]

val v_a: T_A[T_A[CC_A[Char], T_A[Char, Int]], T_A[Char, Int]] = null
val v_b: Int = v_a match{
  case CC_A((12,_), _) => 0 
}
}
// This is not matched: (CC_C (CC_F T_B T_B)
//      (CC_E (CC_A T_B
//                  (Tuple Byte Boolean)
//                  Wildcard
//                  (Tuple Byte Wildcard)
//                  Wildcard
//                  (T_A T_B (Tuple Byte Boolean)))
//            T_B)
//      Wildcard
//      (T_A (CC_A T_B T_B T_B T_B T_B T_B) (CC_F T_B T_B)))