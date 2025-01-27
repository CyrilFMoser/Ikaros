package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, Byte]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_B Byte
//      (CC_B Byte
//            (CC_C Byte Wildcard (Tuple Char Wildcard) Wildcard (T_A Byte))
//            (T_A Byte))
//      (T_A Byte))