package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[Boolean, E]
case class CC_C[G](a: Byte) extends T_B[CC_A[(Byte,Int)], G]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C(0) => 0 
}
}
// This is not matched: Pattern match is empty without constants