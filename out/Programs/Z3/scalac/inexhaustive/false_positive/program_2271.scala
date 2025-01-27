package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Char) extends T_A[T_A[T_B]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_B Byte (CC_B Byte Wildcard Byte (T_A Byte)) Wildcard (T_A Byte))