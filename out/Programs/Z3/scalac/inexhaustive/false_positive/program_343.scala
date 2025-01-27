package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Int) extends T_A[B]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_A Byte
//      Wildcard
//      (CC_B Byte (CC_C Byte (T_B Byte)) (T_B Byte))
//      Wildcard
//      (T_A Byte (T_B Byte)))