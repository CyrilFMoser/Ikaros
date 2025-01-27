package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B) extends T_A[B]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_B Byte
//      Byte
//      Wildcard
//      Wildcard
//      (CC_B Byte Byte Wildcard Wildcard Wildcard (T_A Byte Byte))
//      (T_A Byte Byte))