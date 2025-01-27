package Program_29 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Byte,Char)) extends T_A[T_A[Boolean]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((_,'x')) => 0 
}
}
// This is not matched: (CC_B Byte Wildcard (CC_B Byte Wildcard Wildcard (T_A Byte)) (T_A Byte))