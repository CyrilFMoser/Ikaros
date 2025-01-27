package Program_14 

package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C](a: Byte) extends T_A[C, D]
case class CC_B[E]() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}
// This is not matched: (CC_B T_B T_B)
// This is not matched: Pattern match is empty without constants