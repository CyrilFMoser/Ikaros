package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A[D](a: Int) extends T_A[D]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_D Byte
//      (CC_A T_A)
//      Wildcard
//      (CC_B Wildcard (CC_A T_A) T_A)
//      (T_B Byte (CC_A T_A)))