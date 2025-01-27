package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: Char, b: T_A[Byte]) extends T_A[(Byte,Char)]

val v_a: T_A[(Byte,Char)] = null
val v_b: Int = v_a match{
  case CC_A('x', _) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)