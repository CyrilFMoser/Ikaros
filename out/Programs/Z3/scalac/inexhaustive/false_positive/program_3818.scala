package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C]() extends T_A[D, C]
case class CC_B[E](a: (Char,Byte)) extends T_A[CC_A[Boolean, Int], E]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(('x',_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants