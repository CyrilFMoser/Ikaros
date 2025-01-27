package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B) extends T_A[B]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_A (Tuple (CC_B (CC_D (Tuple Byte Int) T_A (T_B T_A (Tuple Byte Int)))
//                   (CC_B Wildcard Wildcard T_A)
//                   T_A)
//             (CC_B (CC_D (Tuple Byte Int) T_A (T_B T_A (Tuple Byte Int)))
//                   (CC_A Wildcard Wildcard Wildcard T_A)
//                   T_A))
//      Wildcard
//      (CC_D T_A T_A (T_B T_A T_A))
//      T_A)