package Program_14 

package Program_9 

object Test {
sealed trait T_A
case class CC_A[A](a: A, b: Byte, c: A) extends T_A
case class CC_B(a: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_A(_, 0, _) => 1 
  case CC_B(_) => 2 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_B (T_A T_B))