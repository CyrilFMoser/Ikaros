package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[E](a: E) extends T_A[((Byte,Int),Byte), E]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: Pattern match is empty without constants