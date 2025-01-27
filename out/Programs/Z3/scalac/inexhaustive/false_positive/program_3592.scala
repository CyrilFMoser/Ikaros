package Program_10 

object Test {
sealed trait T_B[C, D]
case class CC_B[G, H](a: (Char,Byte)) extends T_B[G, H]

val v_a: CC_B[Int, Int] = null
val v_b: Int = v_a match{
  case CC_B(('x',_)) => 0 
}
}
// This is not matched: (CC_B Byte
//      (CC_B Byte Wildcard Wildcard (T_B Byte))
//      (CC_C Char (CC_C Char Wildcard (T_B Char)) (T_B Char))
//      (T_B Byte))