package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[T_A[Boolean, Byte], C]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: Pattern match is empty without constants