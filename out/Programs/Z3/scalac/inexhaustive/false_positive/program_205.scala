package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_B[E](a: (Char,Byte)) extends T_A[T_B[Int], E]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(('x',_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants