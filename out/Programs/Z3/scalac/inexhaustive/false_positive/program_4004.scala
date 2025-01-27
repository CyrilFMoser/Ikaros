package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_B[D, E]() extends T_A[E, D]
case class CC_C(a: Byte) extends T_A[CC_B[(Byte,Char), Byte], T_A[CC_B[(Byte,Char), Byte], CC_B[(Byte,Char), Byte]]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(0) => 0 
}
}
// This is not matched: Pattern match is empty without constants