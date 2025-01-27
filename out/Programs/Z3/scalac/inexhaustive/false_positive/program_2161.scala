package Program_30 

package Program_7 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A, b: Boolean, c: A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_C (T_A (CC_B Boolean))
//      (CC_B (T_A (T_A Char)))
//      (T_B (CC_A (T_A (CC_B Boolean)) Boolean Boolean) (T_A (CC_B Boolean))))