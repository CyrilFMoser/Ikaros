package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[E](a: E) extends T_A[(Int,Byte), E]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_A Wildcard (CC_A Byte Wildcard T_A) T_A)