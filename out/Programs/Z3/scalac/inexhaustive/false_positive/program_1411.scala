package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Char) extends T_A[T_A[Byte, Byte], T_A[Char, Byte]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: Pattern match is empty without constants