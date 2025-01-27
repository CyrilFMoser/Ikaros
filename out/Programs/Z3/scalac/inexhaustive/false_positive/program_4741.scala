package Program_12 

object Test {
sealed trait T_A[A]
case class CC_B(a: Byte) extends T_A[T_A[Byte]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_B Wildcard
//      (T_A (T_A Boolean Int) (CC_A Byte Char Boolean Boolean Boolean Boolean)))