package Program_31 

object Test {
sealed trait T_A[A]
case class CC_B(a: (Byte,Char)) extends T_A[Byte]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B((_,'x')) => 0 
}
}
// This is not matched: (CC_B Boolean (T_A Boolean))