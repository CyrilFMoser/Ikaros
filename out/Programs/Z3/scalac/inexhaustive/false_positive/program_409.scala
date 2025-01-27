package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[C, D]
case class CC_C() extends T_A[((Char,Int),Char)]
case class CC_E[H](a: Int, b: T_A[CC_C]) extends T_B[Byte, H]

val v_a: T_B[Byte, T_A[((Char,Int),Char)]] = null
val v_b: Int = v_a match{
  case CC_E(12, _) => 0 
}
}
// This is not matched: (CC_E (T_A (Tuple (Tuple Char Int) Char) (Tuple Char Int))
//      Int
//      Wildcard
//      Wildcard
//      (T_B Byte (T_A (Tuple (Tuple Char Int) Char) (Tuple Char Int))))