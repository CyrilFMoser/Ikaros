package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: Char) extends T_A[B]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: Pattern match is empty without constants