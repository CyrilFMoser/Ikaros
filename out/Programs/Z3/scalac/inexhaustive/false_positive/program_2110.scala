package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_C[J, K](a: K) extends T_A[J, K]

val v_a: CC_C[Char, Int] = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_B Byte
//      Wildcard
//      Wildcard
//      (CC_B Byte
//            Wildcard
//            Wildcard
//            (CC_A Byte Int (T_A Byte Char))
//            (T_A Byte Char))
//      (T_A Byte Char))