package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: D) extends T_A[D, C]

val v_a: CC_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_B Byte
//      (CC_A Byte Boolean Wildcard Wildcard (T_A Byte))
//      Char
//      Wildcard
//      (T_A Byte))