package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_C[E](a: Byte) extends T_A[(Byte,Byte), E]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C(0) => 0 
}
}
// This is not matched: Pattern match is empty without constants