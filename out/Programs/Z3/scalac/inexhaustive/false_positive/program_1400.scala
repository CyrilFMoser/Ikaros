package Program_30 

package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: Byte) extends T_A
case class CC_B[E, D](a: T_A) extends T_B[D, E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_A(0) => 1 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)
// This is not matched: (CC_B Wildcard T_A)