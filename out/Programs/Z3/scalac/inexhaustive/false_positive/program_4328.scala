package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[E, F](a: Byte) extends T_A[E, F]

val v_a: CC_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_A Byte
//      Char
//      (CC_B Byte Byte Wildcard (T_A Byte Byte))
//      (CC_D Char
//            Byte
//            Wildcard
//            (CC_B Byte Char Byte (T_A Byte Char))
//            (T_B Byte Char))
//      Wildcard
//      (T_A Byte Char))