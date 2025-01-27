package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Char,Char), b: T_A[C, C]) extends T_A[C, (Byte,Char)]

val v_a: T_A[Int, (Byte,Char)] = null
val v_b: Int = v_a match{
  case CC_A(('x',_), _) => 0 
}
}
// This is not matched: Pattern match is empty without constants