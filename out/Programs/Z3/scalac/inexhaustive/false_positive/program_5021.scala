package Program_11 

package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: (T_B,T_B), b: T_B) extends T_A[C, T_B]
case class CC_B(a: (Byte,T_B)) extends T_B

val v_a: T_A[Byte, T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B(_)) => 0 
  case CC_A(_, _) => 1 
}
}
// This is not matched: (CC_A Byte T_B Wildcard Wildcard (T_A Byte T_B))
// This is not matched: (CC_A T_A)