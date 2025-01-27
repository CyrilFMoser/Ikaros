package Program_31 

package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: (T_A,T_A)) extends T_A
case class CC_B[D](a: Byte, b: D) extends T_B[D, CC_A[D]]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_),CC_A(_))) => 0 
}
}
// This is not matched: (CC_A Int (Tuple Wildcard (CC_A T_A Wildcard T_A)) T_A)
// This is not matched: (CC_B Wildcard
//      Wildcard
//      Wildcard
//      (T_A (T_A Boolean Char) (T_A (Tuple Char Byte) Boolean)))