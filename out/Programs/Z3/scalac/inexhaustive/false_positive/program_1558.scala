package Program_29 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: Char) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x') => 0 
}
}
// This is not matched: (CC_A Wildcard T_A)