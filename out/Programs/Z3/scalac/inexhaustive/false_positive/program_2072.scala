package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: Char) extends T_A[T_A[Boolean]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_C Byte (T_A Byte))