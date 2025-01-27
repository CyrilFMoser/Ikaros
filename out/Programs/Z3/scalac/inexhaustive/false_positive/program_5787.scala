package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte) extends T_A[T_A[Int]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_C Byte
//      (CC_C Byte
//            (CC_B (T_A Byte))
//            Wildcard
//            (CC_D Byte Wildcard (CC_A Byte Byte (T_A Byte)) (T_B Byte))
//            (T_A Byte))
//      Char
//      Wildcard
//      (T_A Byte))