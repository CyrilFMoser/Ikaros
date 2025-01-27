package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_B(a: Byte) extends T_A[(T_B,Int)]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_A (Tuple (CC_A Wildcard Wildcard T_A)
//             (CC_A Wildcard (CC_C Wildcard Wildcard T_A) T_A))
//      Wildcard
//      T_A)