package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: C) extends T_A[C, D]

val v_a: CC_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_D T_B Wildcard T_B)
// Mutation information: 
// Deleted Pattern CC_C((CC_C(_, _),CC_D(_)), _) at position 7