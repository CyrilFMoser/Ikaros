package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_C[E](a: Int) extends T_B[E]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: Pattern match is empty without constants