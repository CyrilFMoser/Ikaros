package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (Char,Int)) extends T_A[T_A[Boolean, Byte], T_A[Boolean, Int]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(('x',_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants