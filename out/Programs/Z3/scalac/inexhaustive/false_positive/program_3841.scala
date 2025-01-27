package Program_9 

object Test {
sealed trait T_A[A]
case class CC_B[C](a: Int) extends T_A[C]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_B Byte
//      (CC_B Byte Wildcard Byte Wildcard (T_A Byte))
//      Wildcard
//      Wildcard
//      (T_A Byte))