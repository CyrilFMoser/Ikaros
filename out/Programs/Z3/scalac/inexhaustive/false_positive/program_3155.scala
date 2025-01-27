package Program_14 

package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (T_B,T_B)) extends T_A[T_B, T_B]
case class CC_B() extends T_B

val v_a: T_A[T_B, T_B] = null
val v_b: Int = v_a match{
  case CC_A((CC_B(),CC_B())) => 0 
}
}
// This is not matched: (CC_A T_B Wildcard (T_A T_B T_B))
// This is not matched: (CC_C Wildcard T_A)