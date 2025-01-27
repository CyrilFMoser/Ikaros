package Program_36 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: (T_B,T_B)) extends T_A[C, T_B]
case class CC_B() extends T_B
case class CC_D() extends T_B

val v_a: T_A[Char, T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_D(),_)) => 0 
}
}
// This is not matched: (CC_A Char Wildcard (Tuple Wildcard (CC_B T_B)) (T_A Char T_B))
// Mutation information: 
// Deleted Pattern CC_A(_, (CC_C(_),CC_C(_))) at position 2