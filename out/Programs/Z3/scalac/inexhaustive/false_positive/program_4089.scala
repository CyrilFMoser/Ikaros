package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, E](a: Int) extends T_A[D, E]

val v_a: CC_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: Pattern match is empty without constants