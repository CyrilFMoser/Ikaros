package Program_30 

package Program_1 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A, b: A, c: A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_A (T_A (Tuple Byte Boolean)))