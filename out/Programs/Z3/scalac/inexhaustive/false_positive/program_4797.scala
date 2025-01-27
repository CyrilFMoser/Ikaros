package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Char], b: Char) extends T_A[T_A[Boolean, Byte], C]

val v_a: T_A[T_A[Boolean, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x') => 0 
}
}
// This is not matched: Pattern match is empty without constants